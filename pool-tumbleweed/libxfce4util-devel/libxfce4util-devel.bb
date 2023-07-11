SUMMARY = "Development Files for libxfce4util"
DESCRIPTION = "This package contains the API documentation and development files needed for \
developing applications based on libxfce4util."
LICENSE = "LGPL-2.1-or-later"

PV = "4.18.1"

RPM_NAME = "libxfce4util-devel-4.18.1-1.4.aarch64.rpm"
RPM_HASH = "9d555616217f8f000cfbe163cfc05b725ae44b357a7d0d9344d768bae3e8a00f1e6f4f1967c94f9c640d988e83befc5367e05d25ce9824c6d1359d22ee75cee5"

RPROVIDES:${PN} += "libxfce4util-devel \
pkgconfig-libxfce4util-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxfce4util-tools \
libxfce4util7 \
pkgconfig-glib-2.0 \
typelib-1-0-Libxfce4util-1-0"

inherit rpm
