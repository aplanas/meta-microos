SUMMARY = "System NSS Initialization"
DESCRIPTION = "Default Operation System module that manages applications loading \
NSS globally on the system. This module loads the system defined \
PKCS #11 modules for NSS and chains with other NSS modules to load \
any system or user configured modules."
LICENSE = "MPL-2.0"

PV = "3.89"

RPM_NAME = "mozilla-nss-sysinit-3.89-2.1.aarch64.rpm"
RPM_HASH = "b16062b65e00bdac6ad6c2129cfbf2989312510ef409994b546213d34395291f9a23e30f6212393f41f08b93bef3bd3ff2ac3c0df70b88ac6374901295ee7db9"

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
