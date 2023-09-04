SUMMARY = "Header files for applications that use cppunit and subunit"
DESCRIPTION = "Header files and libraries for developing applications that use cppunit \
and subunit."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "libcppunit_subunit0-devel-1.4.2-3.2.aarch64.rpm"
RPM_HASH = "31272e005b4ecf2921ef1d298a1dc4a682953e720db5dba0d0f41bf5808cb450e8700dd484753c696fb0d9c8106db32595c9d996c4493f1435f0b93e676031cf"

RPROVIDES:${PN} += "libcppunit-subunit0-devel \
pkgconfig-libcppunit-subunit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cppunit-devel \
libcppunit-subunit0 \
subunit-devel"

inherit rpm
