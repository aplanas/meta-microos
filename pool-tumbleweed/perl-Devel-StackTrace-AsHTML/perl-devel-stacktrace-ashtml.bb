SUMMARY = "Displays stack trace in HTML"
DESCRIPTION = "Devel::StackTrace::AsHTML adds 'as_html' method to Devel::StackTrace which \
displays the stack trace in beautiful HTML, with code snippet context and \
function parameters. If you call it on an instance of \
Devel::StackTrace::WithLexicals, you even get to see the lexical variables \
of each stack frame."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-Devel-StackTrace-AsHTML-0.15-1.24.noarch.rpm"
RPM_HASH = "f744e3192d89dbde63ed2d5f10679e89b8958d69378142e76faed7e061c9b898e7b2a332a9da0ef81965c7931b719fd0d7a76c78b7652cd9ce715f28be568ca5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Devel::StackTrace::AsHTML) \
perl-Devel-StackTrace-AsHTML"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Devel::StackTrace)"

inherit rpm
