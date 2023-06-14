SUMMARY = "Development Files for OpenSCAP"
DESCRIPTION = "This package contains the development files (mainly C header files) for the \
OpenSCAP C library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.7"

RPM_NAME = "openscap-devel-1.3.7-1.1.aarch64.rpm"
RPM_HASH = "49a8636d90f24892e3ec87bce178541b7dd79322e458c81ad286753a1334c0b44b8746eeb5a23507f648ced7532cf845b582247bee3d6cb82a3956e52043e244"

RPROVIDES:${PN} += "openscap-devel \
pkgconfig-libopenscap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenscap25 \
openscap"

inherit rpm
