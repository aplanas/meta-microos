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

RPM_NAME = "python310-railroad-diagrams-3.0.1-1.1.noarch.rpm"
RPM_HASH = "378d5ecb4b664a09e6e009bbfee6667b9fd707ff6a76b09cea99008da4ddc3b5135e1f2061d74de7018dd0bc85fb45aec09f24e07205c87980b340008b90228b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-railroad-diagrams \
python3.10dist-railroad-diagrams \
python310-railroad-diagrams \
python3dist-railroad-diagrams"

RDEPENDS:${PN} += "python-abi"

inherit rpm
