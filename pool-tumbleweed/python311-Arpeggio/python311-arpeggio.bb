SUMMARY = "Packrat parser interpreter"
DESCRIPTION = "Arpeggio is a recursive descent parser with memoization based on PEG grammars \
(aka Packrat parser). \
 \
For a higher level parsing/language tool (i.e., a nicer interface to \
Arpeggio) see textX"
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-Arpeggio-2.0.2-1.1.noarch.rpm"
RPM_HASH = "ff9488594efc62a40793707c43f16aa2c03bd0cf3f0c051de19e3830b4996b7ddc93415ca2fec1fec16a15d6072d3dea1138c38f1ce199456dc5bd80e1268ef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Arpeggio \
python3.11dist-arpeggio \
python311-Arpeggio \
python3dist-arpeggio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
