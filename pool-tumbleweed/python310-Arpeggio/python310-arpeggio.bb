SUMMARY = "Packrat parser interpreter"
DESCRIPTION = "Arpeggio is a recursive descent parser with memoization based on PEG grammars \
(aka Packrat parser). \
 \
For a higher level parsing/language tool (i.e., a nicer interface to \
Arpeggio) see textX"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-Arpeggio-2.0.0-3.3.noarch.rpm"
RPM_HASH = "2f5f7d70305db177ed42a3ae8b95bdf9b1a09275f4cd204e907ebabba1fec674bf86333688b0d516b3360bc61159bc88130eacb3925a9df784ea9f4729b7d9d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Arpeggio \
python3.10dist(arpeggio) \
python310-Arpeggio \
python3dist(arpeggio)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
