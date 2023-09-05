SUMMARY = "System NSS Initialization"
DESCRIPTION = "Default Operation System module that manages applications loading \
NSS globally on the system. This module loads the system defined \
PKCS #11 modules for NSS and chains with other NSS modules to load \
any system or user configured modules."
LICENSE = "MPL-2.0"

PV = "3.92"

RPM_NAME = "mozilla-nss-sysinit-3.92-1.1.aarch64.rpm"
RPM_HASH = "26290c2d2fc07600dec0300a03814b80808e3e5e4089055ce77f73a00ffdafd9e3a6f7a3753bab4716c4e7066f58772ce504f531f720302446385bf89f0253d1"

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
