SUMMARY = "Pam module to cache login credentials"
DESCRIPTION = "The pam_ccreds module provides the means for Linux workstations to \
locally authenticate using an enterprise identity when the network is \
unavailable. Used in conjunction with the nss_updatedb utility, it \
provides a mechanism for disconnected use of network directories."
LICENSE = "GPL-2.0-or-later"

PV = "10"

RPM_NAME = "pam_ccreds-10-27.8.aarch64.rpm"
RPM_HASH = "c762b9b41229bdd12f99d646200dfa9ca178cca0153f5ee70f623f6b4eabe77b9e6ea27d6e1bf79e30335d2bac9e4213a1a6700838ecb4d92175ff8733bba6aa"

RPROVIDES:${PN} += "pam_ccreds \
pam_ccreds(aarch-64)"
RDEPENDS:${PN} += "db \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libdb-4.8.so()(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpam_misc.so.0()(64bit) \
pam"

inherit rpm
