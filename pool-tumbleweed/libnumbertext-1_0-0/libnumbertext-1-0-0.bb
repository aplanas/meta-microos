SUMMARY = "Language-neutral NUMBERTEXT and MONEYTEXT functions"
DESCRIPTION = "Language-neutral NUMBERTEXT and MONEYTEXT functions for LibreOffice Calc"
LICENSE = "MPL-2.0"

PV = "1.0.11"

RPM_NAME = "libnumbertext-1_0-0-1.0.11-1.3.aarch64.rpm"
RPM_HASH = "5fff8305af3efa3061322e4ac3afa9e1f86da17ece23e978341a5238e9db22966dcd74775e915405d7658fd88bfc074a2c3fbf6360c5fbcd01dfd428c8285d3d"

RPROVIDES:${PN} += "libnumbertext-1-0-0 \
libnumbertext-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnumbertext-data \
libstdc++.so.6"

inherit rpm
