SUMMARY = "Python3 bindings for marisa"
DESCRIPTION = "Python3 bindings for marisa."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "python3-marisa-0.2.6-1.21.aarch64.rpm"
RPM_HASH = "d7ae51bd8c8bc96251e6e05a9f84856d5362b409f625ee9dba19b7122892d22313cb236d2f983327929fb7c7e71191b72d6cbb467f8883a732f358204f5d3cc0"

RPROVIDES:${PN} += "python3-marisa \
python3.10dist-marisa \
python3dist-marisa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmarisa.so.0 \
libstdc++.so.6 \
marisa \
python-abi"

inherit rpm
