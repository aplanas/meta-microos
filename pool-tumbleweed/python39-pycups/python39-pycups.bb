SUMMARY = "Python Bindings for CUPS"
DESCRIPTION = "Python Bindings for CUPS, the Common Unix Printing System"
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python39-pycups-2.0.1-3.1.aarch64.rpm"
RPM_HASH = "e9d85abdfe45491b875ca45433a3eaaf799cb74b1f23945a9f5a75e6ef677a76d2f6abe09db2bc92430d6225579c89068f00e0a14a34cf8d579c2abacdc602c7"

RPROVIDES:${PN} += "python3.9dist-pycups \
python39-cups \
python39-pycups \
python3dist-pycups"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
python-abi"

inherit rpm
