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

RPM_NAME = "python311-railroad-diagrams-3.0.1-1.1.noarch.rpm"
RPM_HASH = "d6a730fb3fd4e735ff8fe4deb8707f4a292d1dc8ac5e637836e4d43c986904579f29efee264be684f4bb47c2bd225608aa657de6d42aefa1ebc7f1fdd97425f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(railroad-diagrams) \
python311-railroad-diagrams \
python3dist(railroad-diagrams)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
