SUMMARY = "Development files for libsass, a library for a CSS preprocessor language"
DESCRIPTION = "This package provides development header files for libsass."
LICENSE = "MIT"

PV = "3.6.5"

RPM_NAME = "libsass-devel-3.6.5-1.9.aarch64.rpm"
RPM_HASH = "c2d172c80c297c7266fea04d205de199cefcaf17830be3c641ac871ddbed53b2aa6308dbfbae0e00c9e0438e634cd9a0df7ffd6e93924bd002663a72d830f6ef"

RPROVIDES:${PN} += "libsass-devel \
pkgconfig-libsass"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsass-3-6-5-1"

inherit rpm
