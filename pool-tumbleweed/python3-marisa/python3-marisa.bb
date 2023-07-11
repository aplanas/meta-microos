SUMMARY = "Python3 bindings for marisa"
DESCRIPTION = "Python3 bindings for marisa."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "python3-marisa-0.2.6-1.23.aarch64.rpm"
RPM_HASH = "e13282489b774a84bcfd3e34c73317ff1762c9b3dc0f3df8ed5739e797ea3b7e224018ed0a2b3a52a9fc3083c2419a397896349ac5b5ee911dc7c9a560cd87f5"

RPROVIDES:${PN} += "python3-marisa \
python3.11dist-marisa \
python3dist-marisa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmarisa.so.0 \
libstdc++.so.6 \
marisa \
python-abi"

inherit rpm
