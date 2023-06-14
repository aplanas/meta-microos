SUMMARY = "Corosync configuration database library"
DESCRIPTION = "This package contains the Corosync configuration database library."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libcfg6-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "e854e779fbd9bb47b6982c53582657bbc35ffe35c96a5ae7d5c63c1ee9b06008bc3ad4848e7571a33dbe09bddcee7c25d15781334901cf5a752b61f5860d036a"

RPROVIDES:${PN} += "libcfg.so.6 \
libcfg6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcorosync-common.so.4 \
libqb.so.100"

inherit rpm
