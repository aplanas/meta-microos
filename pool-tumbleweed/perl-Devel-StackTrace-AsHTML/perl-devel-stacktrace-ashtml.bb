SUMMARY = "Displays stack trace in HTML"
DESCRIPTION = "Devel::StackTrace::AsHTML adds 'as_html' method to Devel::StackTrace which \
displays the stack trace in beautiful HTML, with code snippet context and \
function parameters. If you call it on an instance of \
Devel::StackTrace::WithLexicals, you even get to see the lexical variables \
of each stack frame."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-Devel-StackTrace-AsHTML-0.15-1.25.noarch.rpm"
RPM_HASH = "02edb0bde1741957c38713b5b4a2eacab65907bfdc3f38e4b6144eed62cc0d3c7901279d9a41677c2779954ea1f416cbc20760b44cd25466bf5854a241652c68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--StackTrace--AsHTML \
perl-Devel-StackTrace-AsHTML"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Devel--StackTrace"

inherit rpm
