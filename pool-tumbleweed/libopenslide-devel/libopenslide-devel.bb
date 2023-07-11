SUMMARY = "Development files for openslide"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use openslide."
LICENSE = "LGPL-2.1-only"

PV = "3.4.1"

RPM_NAME = "libopenslide-devel-3.4.1-2.26.aarch64.rpm"
RPM_HASH = "195687653aa342ee9eb35a40d98eff86d41e2cf7d834fe5925c0f8fbf8443a4145d40894a79606a0e7606613142faff7610b23c8aeca66f6ff44a476f484c2ce"

RPROVIDES:${PN} += "libopenslide-devel \
pkgconfig-openslide"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenslide0"

inherit rpm
