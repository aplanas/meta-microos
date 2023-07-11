SUMMARY = "MariaDB embedded server development files"
DESCRIPTION = "This package contains the development header files and libraries \
for developing applications that embed the MariaDB."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "11.0.2"

RPM_NAME = "libmariadbd-devel-11.0.2-1.1.aarch64.rpm"
RPM_HASH = "071415331abe80e0bce1eabc9d242b31b676a09f74b50b9e27b8fb4e5ec5ae4bdc72033e84bf544f92dc1bb6409c520e1ed0a1ed107b93a806cdf659574923e2"

RPROVIDES:${PN} += "libmariadbd-devel \
libmysqld-devel"

RDEPENDS:${PN} += "libaio-devel \
libmariadb-devel \
libmariadbd19 \
tcpd-devel"

inherit rpm
