SUMMARY = "Python Bindings for CUPS"
DESCRIPTION = "Python Bindings for CUPS, the Common Unix Printing System"
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python311-pycups-2.0.1-3.1.aarch64.rpm"
RPM_HASH = "795304dd92c492c68e959f53e39d7c773b683695a965e3c39693dd7abce9078b033f55ebc85bfec2f695c7a0607550a213f0c8c1b78f156d1b64026b2601edf5"

RPROVIDES:${PN} += "python3-cups \
python3-pycups \
python3.11dist-pycups \
python311-cups \
python311-pycups \
python3dist-pycups"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
python-abi"

inherit rpm
