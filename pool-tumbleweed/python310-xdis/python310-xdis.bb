SUMMARY = "Python cross-version byte-code disassembler and marshal routines"
DESCRIPTION = "Python cross-version byte-code disassembler and marshal routines."
LICENSE = "GPL-2.0-only"

PV = "6.0.5"

RPM_NAME = "python310-xdis-6.0.5-1.3.noarch.rpm"
RPM_HASH = "8756ba319de5886f68b76148539685bb554856f96f7b7308e6d2b6fb2ed4c887878b9ea14732c6e0a2a63d149bcf0199e0b70138f4db3671228a23f83f4334c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xdis \
python3.10dist-xdis \
python310-xdis \
python3dist-xdis"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-click \
python310-setuptools \
python310-six \
update-alternatives"

inherit rpm
