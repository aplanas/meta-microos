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

RPM_NAME = "python311-railroad-diagrams-3.0.1-1.3.noarch.rpm"
RPM_HASH = "cb19aa47e56b83954d4fafaa771d3a112110172875c97b675dc921eba9a59c4a17362649fc623a5d5ef271cc4fcebfa3f6665607f7894837b7e3398af482884e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-railroad-diagrams \
python3.11dist-railroad-diagrams \
python311-railroad-diagrams \
python3dist-railroad-diagrams"

RDEPENDS:${PN} += "python-abi"

inherit rpm
