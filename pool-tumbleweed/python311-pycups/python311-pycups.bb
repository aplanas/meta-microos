SUMMARY = "Python Bindings for CUPS"
DESCRIPTION = "Python Bindings for CUPS, the Common Unix Printing System"
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python311-pycups-2.0.1-2.8.aarch64.rpm"
RPM_HASH = "5f8ce8cb5e5c62474b20e25d7f8a43bd7d1272a2a12738143e3b9d7874d9b2225eb0f594ea295022715dd073d38a54a4c9a74f95e9333915cac9edd3765b3944"

RPROVIDES:${PN} += "python3.11dist(pycups) \
python311-cups \
python311-pycups \
python311-pycups(aarch-64) \
python3dist(pycups)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcups.so.2()(64bit) \
python(abi)"

inherit rpm
