SUMMARY = "Header files for applications that use cppunit and subunit"
DESCRIPTION = "Header files and libraries for developing applications that use cppunit \
and subunit."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "libcppunit_subunit0-devel-1.4.2-3.1.aarch64.rpm"
RPM_HASH = "f7e329c6a5e56754c1d19f94e50bbc3f3e12a8afb712b4e3bcaae53e72eaa94676717a0e7f7380ffdc53e1b30e58653967df8fba8fffe8e99616ee7fa7e139fe"

RPROVIDES:${PN} += "libcppunit-subunit0-devel \
pkgconfig-libcppunit-subunit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cppunit-devel \
libcppunit-subunit0 \
subunit-devel"

inherit rpm
