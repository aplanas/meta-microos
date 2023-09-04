SUMMARY = "Development files for the DRI API"
DESCRIPTION = "This package contains the development environment required for \
compiling programs and libraries using the DRI API."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "Mesa-dri-devel-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "8d4553313aad7aa9949dd9e8718bea6415c27528acf698ae5d76ff188f499c57c8fb72a29d80af377968f1dc606ece46b43d110a95c7e295c5669206928270ee"

RPROVIDES:${PN} += "Mesa-dri-devel \
pkgconfig-dri"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa \
pkgconfig-libdrm"

inherit rpm
