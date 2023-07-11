SUMMARY = "Packrat parser interpreter"
DESCRIPTION = "Arpeggio is a recursive descent parser with memoization based on PEG grammars \
(aka Packrat parser). \
 \
For a higher level parsing/language tool (i.e., a nicer interface to \
Arpeggio) see textX"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-Arpeggio-2.0.0-3.5.noarch.rpm"
RPM_HASH = "524d22642b42bb88178dfd75dfaa9db9fe745bac5975b4a761e5c46078b87082fdb4c57a6e1abad69450c8fe74c14324b05429e64e57f1a6d74dba6a96cc2a9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Arpeggio \
python3.11dist-arpeggio \
python311-Arpeggio \
python3dist-arpeggio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
