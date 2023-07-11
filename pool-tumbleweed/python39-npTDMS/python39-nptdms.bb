SUMMARY = "Python module for reading TDMS files produced by LabView"
DESCRIPTION = "NumPy based module for reading TDMS files produced by LabView."
LICENSE = "LGPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "python39-npTDMS-1.2.0-1.10.noarch.rpm"
RPM_HASH = "61d4531b706f2cd3780a4eb9baac5ceb6981f02fa9c132470e5800423136819a228519d4dc44b4f18a1035784835fa04609e6edf33389a509407c3b4ff0702d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nptdms \
python39-npTDMS \
python3dist-nptdms"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-numpy \
update-alternatives"

inherit rpm
