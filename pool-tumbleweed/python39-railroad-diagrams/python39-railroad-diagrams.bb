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

RPM_NAME = "python39-railroad-diagrams-3.0.1-1.3.noarch.rpm"
RPM_HASH = "f9da558dee52a9ae8d8d4b1ed794d2cc45ebd11b91b6284663394a7189caaa8dc1aebccfe478dc51f3e334e2281568d8f5afbb142d7a11e6a2cac8b1696716aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-railroad-diagrams \
python39-railroad-diagrams \
python3dist-railroad-diagrams"

RDEPENDS:${PN} += "python-abi"

inherit rpm
