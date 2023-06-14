SUMMARY = "LibCVC API -- Development Files"
DESCRIPTION = "Utility library for volume control of pulseaudio from gobject-based \
Cinnamon modules/applications. \
 \
This package contains development files for libcvc."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.8.0"

RPM_NAME = "libcvc-devel-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "6e10a6c6eb7129fa0a18cbe3318aa30dee0324b323144cf16d9998caa10cd6b404d2d83486b478501049b9f947528984885c33a6756f2087402c170442e446f2"

RPROVIDES:${PN} += "libcvc-devel \
pkgconfig-cvc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcvc0 \
pkgconfig \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libpulse \
pkgconfig-libpulse-mainloop-glib \
typelib-1-0-Cvc-1-0"

inherit rpm
