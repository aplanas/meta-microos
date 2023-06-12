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

RPM_NAME = "python39-funcparserlib-1.0.1-1.3.noarch.rpm"
RPM_HASH = "432dbfb130bababf26add0037e2014728ee1c6d60a581e1c905d39094e4b4a10cac602e1fae092cb8abafe03102ffc99f737c7b1fb89ccab0dab2976206123bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(funcparserlib) \
python39-funcparserlib \
python3dist(funcparserlib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
