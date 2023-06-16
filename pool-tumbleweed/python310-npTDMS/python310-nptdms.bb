SUMMARY = "Python module for reading TDMS files produced by LabView"
DESCRIPTION = "NumPy based module for reading TDMS files produced by LabView."
LICENSE = "LGPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "python310-npTDMS-1.2.0-1.8.noarch.rpm"
RPM_HASH = "33df9ed66553c5db717e02f0a1b4ba6b5d62984b00ef63b5b50ad6efc641f61878be6d42a17021b328de634b24e76f4f284f639692104eb1f2ac7d5456f10edc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-npTDMS \
python3.10dist-nptdms \
python310-npTDMS \
python3dist-nptdms"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-numpy \
update-alternatives"

inherit rpm
