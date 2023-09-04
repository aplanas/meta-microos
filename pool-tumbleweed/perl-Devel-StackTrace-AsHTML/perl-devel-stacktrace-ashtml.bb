SUMMARY = "Displays stack trace in HTML"
DESCRIPTION = "Devel::StackTrace::AsHTML adds 'as_html' method to Devel::StackTrace which \
displays the stack trace in beautiful HTML, with code snippet context and \
function parameters. If you call it on an instance of \
Devel::StackTrace::WithLexicals, you even get to see the lexical variables \
of each stack frame."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-Devel-StackTrace-AsHTML-0.15-1.26.noarch.rpm"
RPM_HASH = "1f6d23da813d634bd929a914c19c9fcec93242b454dfa1c9afe2e903fbb2d9259ab253bdbcab49c20de9f2b18a63a20fef18d8971455fd82111662d8c06e703c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--StackTrace--AsHTML \
perl-Devel-StackTrace-AsHTML"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Devel--StackTrace"

inherit rpm
