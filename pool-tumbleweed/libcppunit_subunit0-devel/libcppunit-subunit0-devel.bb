SUMMARY = "Header files for applications that use cppunit and subunit"
DESCRIPTION = "Header files and libraries for developing applications that use cppunit \
and subunit."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "libcppunit_subunit0-devel-1.4.2-2.4.aarch64.rpm"
RPM_HASH = "42987eb357ec0dc82c21d5fb60ee5a8efe13a32c3c1ff811754417e80cfbf700b0a7e384ee367cfdc9e4554592ec2c1acd9fe36366c293f4ece4607c2c5401d9"

RPROVIDES:${PN} += "libcppunit-subunit0-devel \
pkgconfig-libcppunit-subunit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cppunit-devel \
libcppunit-subunit0 \
subunit-devel"

inherit rpm
