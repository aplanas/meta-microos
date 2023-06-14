SUMMARY = "Recursive descent parsing library based on functional combinators"
DESCRIPTION = "The primary focus of funcparserlib is parsing little languages or external \
DSLs (domain specific languages). \
 \
Parsers made with funcparserlib are pure-Python LL(*) parsers. It means that \
it's very easy to write parsers without thinking about lookaheads and other \
hardcore parsing stuff. However, recursive descent parsing is a rather \
low method compared to LL(k) or LR(k) algorithms. Still, parsing with \
funcparserlib is at least twice faster than PyParsing, a very popular library \
for Python."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-funcparserlib-1.0.1-1.3.noarch.rpm"
RPM_HASH = "65b241f3005e3c06aed549d2e1a6c1476839a68af25f5509980e23229a08c24d029ec12bdd260b40936a77feb89c9ec8e777470a8c59e373dd9aaa42d41ea9e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-funcparserlib \
python311-funcparserlib \
python3dist-funcparserlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
