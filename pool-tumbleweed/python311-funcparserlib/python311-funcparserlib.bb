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

RPM_NAME = "python311-funcparserlib-1.0.1-1.5.noarch.rpm"
RPM_HASH = "f4c2233cc66418377356dde84217e0153a70b42e71819f681b7f9fc04047c8caa45f555da85a89f955b177c7216623e04ccae7c31c8eecf74b8d84c7c8c49f23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-funcparserlib \
python3.11dist-funcparserlib \
python311-funcparserlib \
python3dist-funcparserlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
