SUMMARY = "Libsmi Header Files And Static Libraries"
DESCRIPTION = "This package contains the header files and static libraries of package \
libsmi."
LICENSE = "MIT"

PV = "0.4.8"

RPM_NAME = "libsmi-devel-0.4.8-25.7.aarch64.rpm"
RPM_HASH = "b3bacfbe91d13a47b1f0ce23255da4d4ccdf0f04c6d5abf5a097cedb09746df3d4c9ee548327a410d651d838a64dc260b0936241b334113eae4073b0d0be535a"

RPROVIDES:${PN} += "libsmi-devel \
pkgconfig-libsmi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsmi"

inherit rpm
