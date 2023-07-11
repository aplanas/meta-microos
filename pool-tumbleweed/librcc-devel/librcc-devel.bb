SUMMARY = "Development files for librcc, a charset conversion library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of librcc."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.13"

RPM_NAME = "librcc-devel-0.2.13-1.4.aarch64.rpm"
RPM_HASH = "881b0010c361c2b90b5302e4f1e519f161cc3a3f9bec6e86b8c13edf33ffbae1e43fe2b4d0b888c6dbd269d5acda878e45b0ba1ad190e4cb7882175be2e8d63a"

RPROVIDES:${PN} += "librcc-devel \
pkgconfig-librcc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librcc0 \
pkgconfig-libxml-2.0"

inherit rpm
