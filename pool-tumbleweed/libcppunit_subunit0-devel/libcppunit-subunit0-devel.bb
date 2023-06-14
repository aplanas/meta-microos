SUMMARY = "Header files for applications that use cppunit and subunit"
DESCRIPTION = "Header files and libraries for developing applications that use cppunit \
and subunit."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "libcppunit_subunit0-devel-1.4.2-2.2.aarch64.rpm"
RPM_HASH = "e5f31e1f0379ba52c53ad40fbcad894ddf6dd348bf170edf6665ae1ee59aa68e552974da4bbdbe75617553e1a797a6e318c650442101674b84f586884c1e2a0b"

RPROVIDES:${PN} += "libcppunit-subunit0-devel \
pkgconfig-libcppunit-subunit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cppunit-devel \
libcppunit-subunit0 \
subunit-devel"

inherit rpm
