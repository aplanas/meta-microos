SUMMARY = "Library for Rendering PostScript Documents"
DESCRIPTION = "libspectre is a small library for rendering Postscript documents. It \
provides a convenient easy to use API for handling and rendering \
Postscript documents."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.12"

RPM_NAME = "libspectre1-0.2.12-1.4.aarch64.rpm"
RPM_HASH = "465c2af43992b0e4a8d0117e2ff74608fe4283dca1b412af6dbdef3faccdfc57aa16b2694b9d378fd4e5acfb7bab3e2bc823d41d4e168c289b0829663cf2556c"

RPROVIDES:${PN} += "libspectre.so.1 \
libspectre1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgs.so.9"

inherit rpm
