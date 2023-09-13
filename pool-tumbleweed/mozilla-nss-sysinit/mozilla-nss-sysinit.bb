SUMMARY = "System NSS Initialization"
DESCRIPTION = "Default Operation System module that manages applications loading \
NSS globally on the system. This module loads the system defined \
PKCS #11 modules for NSS and chains with other NSS modules to load \
any system or user configured modules."
LICENSE = "MPL-2.0"

PV = "3.93"

RPM_NAME = "mozilla-nss-sysinit-3.93-1.1.aarch64.rpm"
RPM_HASH = "50dd76ea07fd668edd03de2c34d0b98718d37161263b7243b48c6fa60aa5c8833094017b1163bf7ec6348302d5138932fb93c902fe0c16a5de2fe66dcc30c093"

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
