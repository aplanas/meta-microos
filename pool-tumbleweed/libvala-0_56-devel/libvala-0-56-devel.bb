SUMMARY = "Programming language for GNOME"
DESCRIPTION = "Development files for the Vala runtime library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.9"

RPM_NAME = "libvala-0_56-devel-0.56.9-1.1.aarch64.rpm"
RPM_HASH = "0ea91ee22c4686f636e36cdc0eefbf35f4136bd7d6f5f207a76998bcbd034b092b58d677f1756e97cfd1c97cd4caac3a6a93deb2b4ef1ddde9ace5911b2def98"

RPROVIDES:${PN} += "libvala-0-56-devel \
libvala-devel \
pkgconfig-libvala-0.56"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvala-0-56-0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
