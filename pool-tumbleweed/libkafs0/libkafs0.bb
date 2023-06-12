SUMMARY = "KAFS support for Heimdal Kerberos"
DESCRIPTION = "This package contains the library for supporting the in-kernel Andrew File System."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libkafs0-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "cb2de8836d0de04fcc8aa595b4f51e1f76bff8a7ea5539a39d16c871ad74c92d401425da98f1ebf746af6ac250fa1814c79fa96bed0c50b8e0818c6de160c0c8"

RPROVIDES:${PN} += "libkafs.so.0()(64bit) \
libkafs0 \
libkafs0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasn1.so.8()(64bit) \
libasn1.so.8(HEIMDAL_ASN1_1.0)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libhcrypto.so.4()(64bit) \
libhcrypto.so.4(HEIMDAL_CRYPTO_1.0)(64bit) \
libkrb5.so.26()(64bit) \
libkrb5.so.26(HEIMDAL_KRB5_2.0)(64bit) \
libroken.so.18()(64bit) \
libroken.so.18(HEIMDAL_ROKEN_1.0)(64bit)"

inherit rpm