SUMMARY = "Pam module to cache login credentials"
DESCRIPTION = "The pam_ccreds module provides the means for Linux workstations to \
locally authenticate using an enterprise identity when the network is \
unavailable. Used in conjunction with the nss_updatedb utility, it \
provides a mechanism for disconnected use of network directories."
LICENSE = "GPL-2.0-or-later"

PV = "10"

RPM_NAME = "pam_ccreds-10-27.9.aarch64.rpm"
RPM_HASH = "d4e4e0d49657301129f7a5b811f5a591b7397c94d7676c68eb2c4876457c12e9b5cf5587a7fe24069f4f6d35048e404c91f7a11d6f894f69c7d8713ad54282b2"

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
