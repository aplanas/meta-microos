SUMMARY = "Development files for libagdb"
DESCRIPTION = "libagdb is a library to access the SuperFetch database format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libagdb."
LICENSE = "LGPL-3.0-or-later"

PV = "20210429"

RPM_NAME = "libagdb-devel-20210429-3.7.aarch64.rpm"
RPM_HASH = "ea182f2ee715ffbe24bee01b0c55fa2c80fad0c05b4bc09f12bf5987677445e738b07b4e3bb963ef6aea21669cfe7c8ddab570685eaa0a8499f8e4a45b825c8a"

RPROVIDES:${PN} += "libagdb-devel \
pkgconfig-libagdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libagdb1 \
libbfio-devel"

inherit rpm
