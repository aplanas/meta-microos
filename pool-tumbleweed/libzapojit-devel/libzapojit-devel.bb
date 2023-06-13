SUMMARY = "Library for the SkyDrive and Hotmail REST APIs -- Development Files"
DESCRIPTION = "This package provides the files necessary for developing applications \
using libzapojit."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.3"

RPM_NAME = "libzapojit-devel-0.0.3-8.3.aarch64.rpm"
RPM_HASH = "a14bfdabcf4635ae05f58322278d4950155e8d3a3b30e25c18f2b16f2a2cb040f999e4d9423a299ca0e5fc3e05bb84003934f32d71d09ab45e2e46ef60869fe3"

RPROVIDES:${PN} += "libzapojit-devel \
libzapojit-devel(aarch-64) \
pkgconfig(zapojit-0.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzapojit-0_0-0 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(goa-1.0) \
pkgconfig(json-glib-1.0) \
pkgconfig(libsoup-2.4) \
pkgconfig(rest-0.7) \
typelib-1_0-Zpj-0_0"

inherit rpm
