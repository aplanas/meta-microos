SUMMARY = "Python Bindings for CUPS"
DESCRIPTION = "Python Bindings for CUPS, the Common Unix Printing System"
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python310-pycups-2.0.1-2.8.aarch64.rpm"
RPM_HASH = "12a7f7446f38eb9085bb13880827b4ee3b936bad7da92dbe90211a1b55864c79015d5e87ba99566e6c488769bdb729c9cd76d679bbd0504defcf2cd563bd5517"

RPROVIDES:${PN} += "python3-cups \
python3-pycups \
python3.10dist(pycups) \
python310-cups \
python310-pycups \
python310-pycups(aarch-64) \
python3dist(pycups)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcups.so.2()(64bit) \
python(abi)"

inherit rpm
