SUMMARY = "System NSS Initialization"
DESCRIPTION = "Default Operation System module that manages applications loading \
NSS globally on the system. This module loads the system defined \
PKCS #11 modules for NSS and chains with other NSS modules to load \
any system or user configured modules."
LICENSE = "MPL-2.0"

PV = "3.90"

RPM_NAME = "mozilla-nss-sysinit-3.90-2.1.aarch64.rpm"
RPM_HASH = "bed0eb38e893214f4c5af96e56542d511ed1660e871cf1eb210544e4cbfbfdf369bd790de375db92813b82ecac437238a52ebbffc75ce0861be818765e60eb10"

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
