SUMMARY = "Development files for libplayerctl"
DESCRIPTION = "This package provides libraries and headers for developing applications that \
use libplayerctl."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "playerctl-devel-2.4.1-1.9.aarch64.rpm"
RPM_HASH = "79ed4a820885ca86992629f8696c9cba7c2ac7bc367ee76e9e08abc86d1e7475f567df25e2a702cc90934922ccb0e2771fb9920a2599c2cfcd505b1dd9d64772"

RPROVIDES:${PN} += "pkgconfig-playerctl \
playerctl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplayerctl2 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
