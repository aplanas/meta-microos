SUMMARY = "Development files for libcue, a CUE sheet parsing library"
DESCRIPTION = "libcue parses so-called cue sheets from a char string or a FILE \
pointer. \
 \
This package contains the development library symlink and header \
files."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "libcue-devel-2.2.1-1.16.aarch64.rpm"
RPM_HASH = "169cec3af86a49111b0a14dd94a684dedaa02bf1e7bc7e97b0964d483794cf01eb5b5d60de761e1d0bfe6c5e00a72db638043ba265a8118b17b46db21e1d0db7"

RPROVIDES:${PN} += "libcue-devel \
pkgconfig-libcue"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcue2"

inherit rpm
