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

RPM_NAME = "python310-funcparserlib-1.0.1-1.5.noarch.rpm"
RPM_HASH = "abf0214836e900be9f014a214b819430e26c4ecc0ad39640f076a6f22f99845634fd49476231c46ca7197f5863efad1cdd4268f938e15ae86f1b7bb18887f975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-funcparserlib \
python310-funcparserlib \
python3dist-funcparserlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
