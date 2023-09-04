SUMMARY = "Matching Algorithm with Recursively Implemented StorAge"
DESCRIPTION = "The libmarisa0 package contains runtime libraries for marisa."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "libmarisa0-0.2.6-1.24.aarch64.rpm"
RPM_HASH = "8594dea89341a3bdadb8900feb487e6df3788fe893aabf6fbc92d0acf893d2277df7ddd1325611b49303cc9ed22a03f87ae41714a2ff2b9cd045905ab8b8df47"

RPROVIDES:${PN} += "libmarisa.so.0 \
libmarisa0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
