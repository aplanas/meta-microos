SUMMARY = "A malware identification and classification tool"
DESCRIPTION = "YARA is a tool aimed at helping malware researchers to identify and classify \
malware samples. With YARA you can create descriptions of malware families \
based on textual or binary patterns contained on samples of those families. \
Each description consists of a set of strings and a Boolean expression which \
determines its logic."
LICENSE = "BSD-3-Clause"

PV = "4.3.1"

RPM_NAME = "yara-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "47c47ae2b5115f01d562604f19df7a100eed814b9ef1a5d61952e11648664b800939eca0f978ceca1f4c731b1a62765538575c1f9148626e437b3d8fca424f2b"

RPROVIDES:${PN} += "yara"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyara.so.10"

inherit rpm
