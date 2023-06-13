SUMMARY = "Try/catch/finally syntax for perl"
DESCRIPTION = "This module provides a syntax plugin that implements exception-handling \
semantics in a form familiar to users of other languages, being built on a \
block labeled with the 'try' keyword, followed by at least one of a 'catch' \
or 'finally' block. \
 \
As well as providing a handy syntax for this useful behaviour, this module \
also serves to contain a number of code examples for how to implement \
parser plugins and manipulate optrees to provide new syntax and behaviours \
for perl code. \
 \
Syntax similar to this module has now been added to core perl, starting at \
version 5.34.0. If you are writing new code, it is suggested that you \
instead use the Feature::Compat::Try module instead, as that will enable \
the core feature on those supported perl versions, falling back to \
'Syntax::Keyword::Try' on older perls."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.28"

RPM_NAME = "perl-Syntax-Keyword-Try-0.28-1.3.aarch64.rpm"
RPM_HASH = "31a0ba82615d7371aebead8b376440c349686b20db369eb60485812520f4dc47a43ccb61546a78df65cb6cb727db10721c0eba6d4d0fed8c1138cedf68f481f6"

RPROVIDES:${PN} += "perl(Syntax::Keyword::Try) \
perl(Syntax::Keyword::Try::Deparse) \
perl-Syntax-Keyword-Try \
perl-Syntax-Keyword-Try(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(XS::Parse::Keyword)"

inherit rpm
