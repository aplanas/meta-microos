SUMMARY = "TN3270 Access library development files"
DESCRIPTION = "Header files for the TN3270 access library."
LICENSE = "LGPL-3.0-only"

PV = "5.4+git20230322"

RPM_NAME = "lib3270-devel-5.4+git20230322-1.1.aarch64.rpm"
RPM_HASH = "69b25e1eb663ff09a5a15d0212b27bff1132ed18e6a781c0b39bdf80f813903d52a1cb41d9f47d3f70ff4cbd15423a9668b80b6c7a7261a9a80361f9b48d9958"

RPROVIDES:${PN} += "lib3270-devel \
lib3270-devel(aarch-64) \
pkgconfig(lib3270)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
lib3270-5_4"

inherit rpm
