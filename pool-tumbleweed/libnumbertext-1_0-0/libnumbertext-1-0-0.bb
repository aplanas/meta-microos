SUMMARY = "Language-neutral NUMBERTEXT and MONEYTEXT functions"
DESCRIPTION = "Language-neutral NUMBERTEXT and MONEYTEXT functions for LibreOffice Calc"
LICENSE = "MPL-2.0"

PV = "1.0.11"

RPM_NAME = "libnumbertext-1_0-0-1.0.11-1.4.aarch64.rpm"
RPM_HASH = "798ffd7a29e302940a78feb68c55b3dce77034d87328b90a651481b6a476c659901b7d34f1ffe038919db7711aa6e6642f8e43e65a6c8332d4d990c9e29a3642"

RPROVIDES:${PN} += "libnumbertext-1-0-0 \
libnumbertext-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnumbertext-data \
libstdc++.so.6"

inherit rpm
