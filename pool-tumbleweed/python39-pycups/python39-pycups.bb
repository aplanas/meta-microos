SUMMARY = "Python Bindings for CUPS"
DESCRIPTION = "Python Bindings for CUPS, the Common Unix Printing System"
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python39-pycups-2.0.1-2.10.aarch64.rpm"
RPM_HASH = "7a607e15291afdb70c51d3cfe0b41755be3dc00561424f4d64644d7ca5ad821a3234be6c105639afb262f27f4ef9fba3e2d00fb1554b41faea25bd7832f923d9"

RPROVIDES:${PN} += "python3.9dist-pycups \
python39-cups \
python39-pycups \
python3dist-pycups"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
python-abi"

inherit rpm
