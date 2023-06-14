SUMMARY = "Development files for libopenmpt-modplug"
DESCRIPTION = "The libopenmpt-modplug-devel package contains libraries and header files for \
developing applications that use libopenmpt-modplug."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.0"

RPM_NAME = "libopenmpt-modplug-devel-0.8.9.0-1.12.aarch64.rpm"
RPM_HASH = "cf40bc622535422d3f7dd19a8c4e37acdcf4fe7001614f4b74e4fd1a96908a1033cabcd682eaa9b893d2a7c1e53e5adc61828e4e99c702042df7660b698cf3a8"

RPROVIDES:${PN} += "libopenmpt-modplug-devel \
pkgconfig-libopenmpt-modplug"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenmpt-modplug1 \
pkgconfig-libopenmpt"

inherit rpm
