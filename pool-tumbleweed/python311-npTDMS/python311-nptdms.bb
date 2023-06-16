SUMMARY = "Python module for reading TDMS files produced by LabView"
DESCRIPTION = "NumPy based module for reading TDMS files produced by LabView."
LICENSE = "LGPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "python311-npTDMS-1.2.0-1.8.noarch.rpm"
RPM_HASH = "8606de36735e8db1162391e3666b6865e3ff3bcb4afeecaa30f380e461af96e314c62e8aee8c60b2f26758d8f550f2fd1ebcb28b0a3d368318c83705f1a4491e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-nptdms \
python311-npTDMS \
python3dist-nptdms"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-numpy \
update-alternatives"

inherit rpm
