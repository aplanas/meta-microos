SUMMARY = "Library for querying public transport data"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
ransport journey queries."
LICENSE = "LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libKPublicTransport1-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "85fdd3ad12795f83eec80ab0b34bc1cb13f431556616be4ae47a062ad924d9cb47d7d89e3f42ec4ca0a3707543cf5f7097a0bdfa3c858021f0d0993d4642d4df"

RPROVIDES:${PN} += "libKPublicTransport.so.1 \
libKPublicTransport1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
