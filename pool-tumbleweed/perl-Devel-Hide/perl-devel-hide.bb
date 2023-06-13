SUMMARY = "Forces the unavailability of specified Perl modules (for testing)"
DESCRIPTION = "Given a list of Perl modules/filenames, this module makes 'require' and \
'use' statements fail (no matter the specified files/modules are installed \
or not). \
 \
They _die_ with a message like: \
 \
    Can't locate Module/ToHide.pm in @INC (hidden) \
 \
The original intent of this module is to allow Perl developers to test for \
alternative behavior when some modules are not available. In a Perl \
installation, where many modules are already installed, there is a chance \
to screw things up because you take for granted things that may not be \
there in other machines. \
 \
For example, to test if your distribution does the right thing when a \
module is missing, you can do \
 \
    perl -MDevel::Hide=Test::Pod Makefile.PL \
 \
forcing 'Test::Pod' to not be found (whether it is installed or not). \
 \
Another use case is to force a module which can choose between two \
requisites to use the one which is not the default. For example, \
'XML::Simple' needs a parser module and may use 'XML::Parser' or 'XML::SAX' \
(preferring the latter). If you have both of them installed, it will always \
try 'XML::SAX'. But you can say: \
 \
    perl -MDevel::Hide=XML::SAX script_which_uses_xml_simple.pl \
 \
NOTE. This module does not use Carp. As said before, denial _dies_. \
 \
This module is pretty trivial. It uses a code reference in @INC to get rid \
of specific modules during require - denying they can be successfully \
loaded and stopping the search before they have a chance to be found. \
 \
There are three alternative ways to include modules in the hidden list: \
 \
* import() \
 \
this is probably the most commonly used method, called automagically when \
you do this: \
 \
    use Devel::Hide qw(Foo Bar::Baz); \
 \
or \
 \
    perl -MDevel::Hide=... \
 \
* setting @Devel::Hide::HIDDEN \
 \
* environment variable DEVEL_HIDE_PM \
 \
both of these two only support 'global' hiding, whereas 'import()' supports \
lexical hiding as well. \
 \
Optionally, you can provide some arguments *before* the list of modules: \
 \
* -from:children \
 \
propagate the list of hidden modules to your process' child processes. This \
works by populating 'PERL5OPT', and is incompatible with Taint mode, as \
explained in perlrun. Of course, this is unnecessary if your child \
processes are just forks of the current one. \
 \
* -lexically \
 \
This is only available on perl 5.10.0 and later. It is a fatal error to try \
to use it on an older perl. \
 \
Everything following this will only have effect until the end of the \
current scope. Yes, that includes '-quiet'. \
 \
* -quiet \
 \
suppresses diagnostic output. You will still get told about errors. This is \
passed to child processes if -from:children is in effect."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0015"

RPM_NAME = "perl-Devel-Hide-0.0015-1.8.noarch.rpm"
RPM_HASH = "3cfff812767090c666c2470f45ef782c569c68b0ec29aa51ab02d6e2fad82e68a894bf78d820249fa1be7cc97d476e35d96c06c3a198a6f23b8c4f3211bfe74b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Devel::Hide) \
perl-Devel-Hide"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
