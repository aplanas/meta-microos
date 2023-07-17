SUMMARY = "JSON encoder and decoder for Python"
DESCRIPTION = "An ultrafast JSON encoder and decoder written in pure C with \
bindings for Python 2.7 and 3.8+"
LICENSE = "BSD-3-Clause"

PV = "5.8.0"

RPM_NAME = "python310-ujson-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "63494a9074105d8f12ce956415e8921c44678a083946b4e0c4cac9abde70241d19deff51d746bcc0a01bfaad2ec0a27e0c162bcd39108448923a5ead10b3ca6d"

RPROVIDES:${PN} += "python3.10dist-ujson \
python310-ujson \
python3dist-ujson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdouble-conversion.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
