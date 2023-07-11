SUMMARY = "Single Sign On Framework"
DESCRIPTION = "Framework that provides credential storage and authentication service."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "signond-libs-8.60-2.19.aarch64.rpm"
RPM_HASH = "f2133fb01dc3bc11de689cfa841fe115730157206fffb7bb3ca2382755cf676a10ade7a9a31b22133d3b70e0ff16818c7b6b4746c89279c30564ac6868883293"

RPROVIDES:${PN} += "libsignon-extension.so.1 \
libsignon-plugins-common.so.1 \
signond-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
