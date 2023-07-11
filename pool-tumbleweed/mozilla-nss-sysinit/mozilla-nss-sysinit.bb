SUMMARY = "System NSS Initialization"
DESCRIPTION = "Default Operation System module that manages applications loading \
NSS globally on the system. This module loads the system defined \
PKCS #11 modules for NSS and chains with other NSS modules to load \
any system or user configured modules."
LICENSE = "MPL-2.0"

PV = "3.90"

RPM_NAME = "mozilla-nss-sysinit-3.90-1.1.aarch64.rpm"
RPM_HASH = "5c2b727decc8c50549b8e6e681657ff6eaa7e69b912b4746eee387f3cafd6d0707d3b9b7d80c7d6ab1b4da6354ef9ce8c379272e1c024ddb6707bbd78a7a408f"

RPROVIDES:${PN} += "config-mozilla-nss-sysinit \
libnsssysinit.so \
mozilla-nss-sysinit"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnssutil3.so \
libplc4.so \
mozilla-nss"

inherit rpm
