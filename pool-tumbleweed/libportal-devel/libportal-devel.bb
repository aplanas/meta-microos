SUMMARY = "A GIO-style async APIs for most Flatpak portals -- Development files"
DESCRIPTION = "The libportal-devel package contains libraries, build data, and \
header files for developing applications that use libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "libportal-devel-0.6-1.7.aarch64.rpm"
RPM_HASH = "7fe26ebc0419f1fb4a3bc847e59709115f015d2acb7a415b6a8c3a28252348b853daddd7676a239b2256ab821592804e256143e253179ce73c572c56480c96b7"

RPROVIDES:${PN} += "libportal-devel \
libportal-devel(aarch-64) \
pkgconfig(libportal)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportal-1 \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
typelib-1_0-Xdp-1_0"

inherit rpm
