SUMMARY = "Python Bindings for CUPS"
DESCRIPTION = "Python Bindings for CUPS, the Common Unix Printing System"
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python310-pycups-2.0.1-2.10.aarch64.rpm"
RPM_HASH = "d170669366e7269d841b19990000f777e6152f51a20c38d1fec25af3abe014a7846506f1f8027ad42c430ce1d668ac64466833eadb8b8b21e8dc8ed8d22c157c"

RPROVIDES:${PN} += "python3.10dist-pycups \
python310-cups \
python310-pycups \
python3dist-pycups"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
python-abi"

inherit rpm
