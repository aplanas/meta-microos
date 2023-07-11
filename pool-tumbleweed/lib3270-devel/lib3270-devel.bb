SUMMARY = "TN3270 Access library development files"
DESCRIPTION = "Header files for the TN3270 access library."
LICENSE = "LGPL-3.0-only"

PV = "5.4+git20230322"

RPM_NAME = "lib3270-devel-5.4+git20230322-1.3.aarch64.rpm"
RPM_HASH = "62d21c41459c355b15c40241fd5b7ad8665bff85738bdee44e0f5353e5560740358ef3669c8cfee2e666080e70c09bd338d18500f04c4c3242e88c8d1a5d5275"

RPROVIDES:${PN} += "lib3270-devel \
pkgconfig-lib3270"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lib3270-5-4"

inherit rpm
