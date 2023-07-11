SUMMARY = "Development files for libgdiplus"
DESCRIPTION = "This library is part of the Mono project. It is required when \
using System.Drawing."
LICENSE = "(LGPL-2.1-or-later | MPL-1.1) & MIT"

PV = "6.0.5"

RPM_NAME = "libgdiplus-devel-6.0.5-1.12.aarch64.rpm"
RPM_HASH = "1ca89649d89e1f2d9cae39cb2397d2294439ed330e6738282d11bf361d8285532b67d737f73f61b0285016b03a8a89ffaae4b6093c9f35d2564d72e8419c854a"

RPROVIDES:${PN} += "libgdiplus-devel \
pkgconfig-libgdiplus"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgdiplus0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gthread-2.0"

inherit rpm
