SUMMARY = "Railroad-Diagram Generator"
DESCRIPTION = "This is a small library for generating railroad diagrams (like what JSON.org uses) \
using SVG, with both JS and Python ports. \
 \
Railroad diagrams are a way of visually representing a grammar in a form that is more \
readable than using regular expressions or BNF. They can easily represent any \
context-free grammar, and some more powerful grammars. There are several railroad-diagram \
generators out there, but none of them had the visual appeal I wanted, so I wrote my own."
LICENSE = "CC0-1.0"

PV = "3.0.1"

RPM_NAME = "python310-railroad-diagrams-3.0.1-1.3.noarch.rpm"
RPM_HASH = "96ddb797e5f766e2258fb4c9cb57ac55a3bf6ef7e69b582e7cabc3b95d69677402bf77c2306793f02e292f703a48b1af44994d1eb4ef2e04dc64a832bc6869ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-railroad-diagrams \
python310-railroad-diagrams \
python3dist-railroad-diagrams"

RDEPENDS:${PN} += "python-abi"

inherit rpm
