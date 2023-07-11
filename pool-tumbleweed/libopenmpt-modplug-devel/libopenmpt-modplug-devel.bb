SUMMARY = "Development files for libopenmpt-modplug"
DESCRIPTION = "The libopenmpt-modplug-devel package contains libraries and header files for \
developing applications that use libopenmpt-modplug."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.0"

RPM_NAME = "libopenmpt-modplug-devel-0.8.9.0-1.13.aarch64.rpm"
RPM_HASH = "f457830506e5cc5f346f9fd4f6132bb5b0cc40cfe619e04a92a204fd0741c7519923e400ac6e3c3b11539b87e89050f93db5990606ef84bd9ab8554f8c6e4918"

RPROVIDES:${PN} += "libopenmpt-modplug-devel \
pkgconfig-libopenmpt-modplug"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenmpt-modplug1 \
pkgconfig-libopenmpt"

inherit rpm
