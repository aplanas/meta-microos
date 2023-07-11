SUMMARY = "Libsmi Header Files And Static Libraries"
DESCRIPTION = "This package contains the header files and static libraries of package \
libsmi."
LICENSE = "MIT"

PV = "0.4.8"

RPM_NAME = "libsmi-devel-0.4.8-25.8.aarch64.rpm"
RPM_HASH = "7284f7c4c58f3d5d4334e83b1d9eb4d9e831acfbf32ad89c20dc33014e90094f8e872f5c7a88a23a350c2582a42f1d78adb3c688f4cc7c015d495cb687813c1f"

RPROVIDES:${PN} += "libsmi-devel \
pkgconfig-libsmi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsmi"

inherit rpm
