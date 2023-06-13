SUMMARY = "Development files for dav1d"
DESCRIPTION = "The dav1d-devel package contains libraries and header files for \
developing applications that use dav1d."
LICENSE = "BSD-2-Clause"

PV = "1.2.1"

RPM_NAME = "dav1d-devel-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "a8b2f03a392ad554bc6f0dc24eafaeeaa0caba00b85a06bd99d778a29397230330a2adc966544c0e460367b1ddab7479d0d2287b86046dae72f223f19dee41dd"

RPROVIDES:${PN} += "dav1d-devel \
dav1d-devel(aarch-64) \
pkgconfig(dav1d)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdav1d6"

inherit rpm
