SUMMARY = "Single Sign On Framework"
DESCRIPTION = "Framework that provides credential storage and authentication service."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "signond-libs-8.61-1.1.aarch64.rpm"
RPM_HASH = "0e952b08adac7f3c7db9987966ae18c202119dfe4a8d8d7aa2650de17942cc7266beef301a0ddef7bc4faa05bf6ce3b84c864267f3206f8977a8ba884bdd024f"

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
