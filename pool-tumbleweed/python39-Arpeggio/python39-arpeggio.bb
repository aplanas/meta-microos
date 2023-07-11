SUMMARY = "Packrat parser interpreter"
DESCRIPTION = "Arpeggio is a recursive descent parser with memoization based on PEG grammars \
(aka Packrat parser). \
 \
For a higher level parsing/language tool (i.e., a nicer interface to \
Arpeggio) see textX"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-Arpeggio-2.0.0-3.5.noarch.rpm"
RPM_HASH = "61e3865847a9bde07caf2202e1e2d1e122e80ba5eb52a88659f12def67f6b0b2d259bc8430ce5902487cd1dd1a298544b0fa86dbdcfe50685ed252cda8dbfc1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-arpeggio \
python39-Arpeggio \
python3dist-arpeggio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
