SUMMARY = "System NSS Initialization"
DESCRIPTION = "Default Operation System module that manages applications loading \
NSS globally on the system. This module loads the system defined \
PKCS #11 modules for NSS and chains with other NSS modules to load \
any system or user configured modules."
LICENSE = "MPL-2.0"

PV = "3.91"

RPM_NAME = "mozilla-nss-sysinit-3.91-1.1.aarch64.rpm"
RPM_HASH = "f9dc0171a6c3ec431560c1320f2d2b2ac362641041a675c84e633a5e7b1c20f7d820029c44331899eca1e83285234ff5865ce394dc7cc35e48b5be9d013d65ad"

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
