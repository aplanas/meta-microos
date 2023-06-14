SUMMARY = "Pam module to cache login credentials"
DESCRIPTION = "The pam_ccreds module provides the means for Linux workstations to \
locally authenticate using an enterprise identity when the network is \
unavailable. Used in conjunction with the nss_updatedb utility, it \
provides a mechanism for disconnected use of network directories."
LICENSE = "GPL-2.0-or-later"

PV = "10"

RPM_NAME = "pam_ccreds-10-27.8.aarch64.rpm"
RPM_HASH = "c762b9b41229bdd12f99d646200dfa9ca178cca0153f5ee70f623f6b4eabe77b9e6ea27d6e1bf79e30335d2bac9e4213a1a6700838ecb4d92175ff8733bba6aa"

RPROVIDES:${PN} += "pam-ccreds"

RDEPENDS:${PN} += "db \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdb-4.8.so \
libpam-misc.so.0 \
libpam.so.0 \
pam"

inherit rpm
