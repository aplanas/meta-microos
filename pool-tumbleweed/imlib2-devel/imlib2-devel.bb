SUMMARY = "Imlib 2 - development libraries"
DESCRIPTION = "These are the development headers and library for imlib2."
LICENSE = "BSD-3-Clause"

PV = "1.12.0"

RPM_NAME = "imlib2-devel-1.12.0-1.1.aarch64.rpm"
RPM_HASH = "1f5ca1d627e72aae5b8e88d5068c810acfeccfffcac216877c6737e05dadbd9607afd77c2ec3561b489cdfa61b41f7d654c4bbff381b34be7856ee2afbb182c3"

RPROVIDES:${PN} += "imlib2-devel \
pkgconfig-imlib2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libImlib2-1 \
xorg-x11-libX11-devel"

inherit rpm
