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

RPM_NAME = "python39-funcparserlib-1.0.1-1.5.noarch.rpm"
RPM_HASH = "cd8357de6cd0f77873b49b4ff2c48e110b0bf334343a0196004b2b9bbd0261719b7e3cbb87713d63afacc4d456b7ad6e8e90e1b3f0a4a155e7217f282fb44208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-funcparserlib \
python39-funcparserlib \
python3dist-funcparserlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
