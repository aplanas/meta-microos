SUMMARY = "Packrat parser interpreter"
DESCRIPTION = "Arpeggio is a recursive descent parser with memoization based on PEG grammars \
(aka Packrat parser). \
 \
For a higher level parsing/language tool (i.e., a nicer interface to \
Arpeggio) see textX"
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-Arpeggio-2.0.2-1.1.noarch.rpm"
RPM_HASH = "d2a1bc933d71e925a03f14dd3a7efb74f5514d92064fcaf9aa25059d627fdccbb703debf67af4a304a0fb442719d312bf6c3ab2409fe4640305ea12b6d18638f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-arpeggio \
python39-Arpeggio \
python3dist-arpeggio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
