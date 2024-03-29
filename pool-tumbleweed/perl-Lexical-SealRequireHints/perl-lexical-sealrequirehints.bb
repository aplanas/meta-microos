SUMMARY = "Prevent leakage of lexical hints"
DESCRIPTION = "This module works around two historical bugs in Perl's handling of the \
'%^H' (lexical hints) variable. One bug causes lexical state in one file to \
leak into another that is 'require'd/'use'd/'do'ed from it. This bug, [perl \
 \
The second bug causes lexical state (normally a blank '%^H' once the first \
bug is fixed) to leak outwards from 'utf8.pm', if it is automatically \
loaded during Unicode regular expression matching, into whatever source is \
compiling at the time of the regexp match. This bug, [perl #73174], was \
present from Perl 5.8.7 up to Perl 5.11.5, fixed in Perl 5.12.0. \
 \
Both of these bugs seriously damage the usability of any module relying on \
'%^H' for lexical scoping, on the affected Perl versions. It is in practice \
essential to work around these bugs when using such modules. On versions of \
Perl that require such a workaround, this module globally changes the \
behaviour of 'require', including 'use' and the implicit 'require' \
performed in Unicode regular expression matching, and of 'do', so that they \
no longer exhibit these bugs. \
 \
The workaround supplied by this module takes effect the first time its \
'import' method is called. Typically this will be done by means of a 'use' \
statement. This should be done as early as possible, because it only \
affects 'require'/'use'/'do' statements that are compiled after the \
workaround goes into effect. For 'use' statements, and 'require' and 'do' \
statements that are executed immediately and only once, it suffices to \
invoke the workaround when loading the first module that will set up \
vulnerable lexical state. Delayed-action 'require' and 'do' statements, \
however, are more troublesome, and can require the workaround to be loaded \
much earlier. Ultimately, an affected Perl program may need to load the \
workaround as very nearly its first action. Invoking this module multiple \
times, from multiple modules, is not a problem: the workaround is only \
applied once, and applies to everything subsequently compiled. \
 \
This module is implemented in XS, with a pure Perl backup version for \
systems that can't handle XS modules. The XS version has a better chance of \
playing nicely with other modules that modify 'require' or 'do' handling. \
The pure Perl version can't work at all on some Perl versions; users of \
those versions must use the XS. On all Perl versions suffering the \
underlying hint leakage bug, pure Perl hooking of 'require' breaks the use \
of 'require' without an explicit parameter (implicitly using '$_')."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.012"

RPM_NAME = "perl-Lexical-SealRequireHints-0.012-1.4.aarch64.rpm"
RPM_HASH = "3274e69065bed423073cb0a33dd987b478c49a50aedd648ba0966a0ea929e86123626f42961d3d80ca9b5ab4807128995a5e5a053529b3591ba6376c6e2a7c66"

RPROVIDES:${PN} += "perl-Lexical--SealRequireHints \
perl-Lexical-SealRequireHints"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
