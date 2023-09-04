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

PV = "0.290.0"

RPM_NAME = "perl-Syntax-Keyword-Try-0.290.0-1.2.aarch64.rpm"
RPM_HASH = "2a32ea5c427fc0637d7f6f2001396fcd2257f0d7976c596994fb451d5fa935b71b676cb151d386fe23ee2037b7ae98cd6b74fdd066f3af86b392311a46c50a68"

RPROVIDES:${PN} += "perl-Syntax--Keyword--Try \
perl-Syntax--Keyword--Try--Deparse \
perl-Syntax-Keyword-Try"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-XS--Parse--Keyword"

inherit rpm
