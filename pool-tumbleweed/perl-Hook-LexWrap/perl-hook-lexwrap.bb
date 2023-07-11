SUMMARY = "Lexically scoped subroutine wrappers"
DESCRIPTION = "Hook::LexWrap allows you to install a pre- or post-wrapper (or both) around \
an existing subroutine. Unlike other modules that provide this capacity \
(e.g. Hook::PreAndPost and Hook::WrapSub), Hook::LexWrap implements \
wrappers in such a way that the standard 'caller' function works correctly \
within the wrapped subroutine. \
 \
To install a prewrappers, you write: \
 \
        use Hook::LexWrap; \
 \
        wrap 'subroutine_name', pre => \\&some_other_sub; \
 \
    \
 \
The first argument to 'wrap' is a string containing the name of the \
subroutine to be wrapped (or the typeglob containing it, or a reference to \
it). The subroutine name may be qualified, and the subroutine must already \
be defined. The second argument indicates the type of wrapper being applied \
and must be either ''pre'' or ''post''. The third argument must be a \
reference to a subroutine that implements the wrapper. \
 \
To install a post-wrapper, you write: \
 \
        wrap 'subroutine_name', post => \\&yet_another_sub; \
 \
    \
 \
To install both at once: \
 \
        wrap 'subroutine_name', \
             pre  => \\&some_other_sub, \
             post => \\&yet_another_sub; \
 \
or: \
 \
        wrap *subroutine_name, \
             post => \\&yet_another_sub,  # order in which wrappers are \
             pre  => \\&some_other_sub;   # specified doesn't matter \
 \
Once they are installed, the pre- and post-wrappers will be called before \
and after the subroutine itself, and will be passed the same argument list. \
 \
The pre- and post-wrappers and the original subroutine also all see the \
same (correct!) values from 'caller' and 'wantarray'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.26"

RPM_NAME = "perl-Hook-LexWrap-0.26-1.24.noarch.rpm"
RPM_HASH = "c091513c1274399e72b7ab0e0587beba6dd1f9b12a03cda06f402cfc71cd0841b66e583044d820d4f605b4589932128a56e24ce983b2e7a923fffa3be717966b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hook--LexWrap \
perl-Hook-LexWrap"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
