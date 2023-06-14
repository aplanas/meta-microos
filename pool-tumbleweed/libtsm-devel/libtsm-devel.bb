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

RPM_NAME = "libtsm-devel-4.0.2-1.3.aarch64.rpm"
RPM_HASH = "48ce0c048c3a395a52591e77043b719989c4cc022fea7d8b5f620593ff1c57f1d0d58282329b19a5ae5f6763a6179dfaf51c7e065fee093496aed7c8687f22c3"

RPROVIDES:${PN} += "cmake-libtsm \
libtsm-devel \
pkgconfig-libtsm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtsm4"

inherit rpm
