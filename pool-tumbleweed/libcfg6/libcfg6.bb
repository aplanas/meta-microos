SUMMARY = "Corosync configuration database library"
DESCRIPTION = "This package contains the Corosync configuration database library."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libcfg6-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "e854e779fbd9bb47b6982c53582657bbc35ffe35c96a5ae7d5c63c1ee9b06008bc3ad4848e7571a33dbe09bddcee7c25d15781334901cf5a752b61f5860d036a"

RPROVIDES:${PN} += "libcfg.so.6()(64bit) \
libcfg.so.6(COROSYNC_CFG_0.82)(64bit) \
libcfg6 \
libcfg6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcorosync_common.so.4()(64bit) \
libqb.so.100()(64bit)"

inherit rpm
