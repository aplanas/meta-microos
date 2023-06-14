SUMMARY = "Additional internal libraries for the MariaDB C Connector"
DESCRIPTION = "MariaDB Connector is used to connect applications developed in \
C or C++ to MariaDB and MySQL databases. \
 \
This package holds the runtime components with private API."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.5"

RPM_NAME = "libmariadbprivate-3.3.5-1.1.aarch64.rpm"
RPM_HASH = "ef85305ea78294d9e25b5482dbb72e442022eedc4e24c735887c09eaf99c0d3d3f3a7beba2761cb2330c6ecb926f6abd9603f67123eba47c5c2342f28d960e28"

RPROVIDES:${PN} += "libmariadbprivate \
libmariadbprivate.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1"

inherit rpm
