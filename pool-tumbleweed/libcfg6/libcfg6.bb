SUMMARY = "Corosync configuration database library"
DESCRIPTION = "This package contains the Corosync configuration database library."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libcfg6-2.4.6-1.4.aarch64.rpm"
RPM_HASH = "7cbc79a4f650b5aa2fd5aaf88b668271c50a2c35eb9307ea8fb57bfe4613461bf70865638c8b663a4fbaf2e2807a7fba3e1eeb68fc872802ca7eec145b0f783a"

RPROVIDES:${PN} += "libcfg.so.6 \
libcfg6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcorosync-common.so.4 \
libqb.so.100"

inherit rpm
