SUMMARY = "Python module for reading TDMS files produced by LabView"
DESCRIPTION = "NumPy based module for reading TDMS files produced by LabView."
LICENSE = "LGPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "python39-npTDMS-1.2.0-1.8.noarch.rpm"
RPM_HASH = "2e1c538c87ef77072dcf128c2e3eeeb779e37d378115195b29736d72f52201540fc036115f62c761e6dd43a19ec7292367af9b765dee86e904fed1cba37d4271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nptdms) \
python39-npTDMS \
python3dist(nptdms)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-numpy \
update-alternatives"

inherit rpm
