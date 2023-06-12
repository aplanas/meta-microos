SUMMARY = "Qt 5 Wayland Addon Non-ABI stable experimental API files"
DESCRIPTION = "This package provides private headers of libqt5-qtwayland that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde55"

RPM_NAME = "libqt5-qtwayland-private-headers-devel-5.15.9+kde55-1.1.noarch.rpm"
RPM_HASH = "13cb68e20606ffdaf94e243f9ee947dda7bdf332ae731559905b3d1a7ac4f0a9b3f4724a511443abbf38067591cfb9e2dd5fb838a9ac26f9756aaa7287575072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtwayland-private-headers-devel"
RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtwayland-devel"

inherit rpm
