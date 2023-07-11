SUMMARY = "Python module for reading TDMS files produced by LabView"
DESCRIPTION = "NumPy based module for reading TDMS files produced by LabView."
LICENSE = "LGPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "python311-npTDMS-1.2.0-1.10.noarch.rpm"
RPM_HASH = "97555924884ad483250251ffc9c119c2bdb9f26867afdc4e00191f6f2e8fa210b88544369abd6551b6587891dacfa1fa3b8e37b082a6661a2aa159222417fe6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-npTDMS \
python3.11dist-nptdms \
python311-npTDMS \
python3dist-nptdms"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-numpy \
update-alternatives"

inherit rpm
