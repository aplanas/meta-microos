SUMMARY = "Development files for the XA API"
DESCRIPTION = "This package contains the XA state tracker for gallium3D driver. \
It superseeds the Xorg state tracker and provides an infrastructure \
to accelerate Xorg 2D operations. It is currently used by vmwgfx \
video driver. \
 \
This package provides the development environment for compiling \
programs against the XA state tracker."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libxatracker-devel-1.0.0-355.1.aarch64.rpm"
RPM_HASH = "3615b80b4a2297e19726194eebf56abd5152e881c873a1953d8b499774c71c1a9922c1135ff1598363fdcf6ca87e449877e0f0ddd44031dc9c18983aa23d6bc6"

RPROVIDES:${PN} += "libxatracker-devel \
pkgconfig-xatracker"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxatracker2"

inherit rpm
