SUMMARY = "Development files for the DEC-VT terminal state machine library"
DESCRIPTION = "TSM is a state machine for DEC VT100-VT520 compatible terminal \
emulators. It can be used to implement terminal emulators, or other \
applications that need to interpret terminal escape sequences. The \
library does no rendering or window management of its own, and does \
not depend on a graphics stack, unlike the similar GNOME libvte. \
 \
This package contains the development headers for the library found \
in libtsm4."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "libtsm-devel-4.0.2-1.4.aarch64.rpm"
RPM_HASH = "000d2694977f5e7617ba795d3d6aa96a8c139943519cb534466643b2b2e9955eb20e6c22901855dcd6a67d2a38124dede34fac15e6639a79e55933308d0f8ad5"

RPROVIDES:${PN} += "cmake-libtsm \
libtsm-devel \
pkgconfig-libtsm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtsm4"

inherit rpm
