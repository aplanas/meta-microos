SUMMARY = "Colour ASCII Art Text mode graphics utilities based on libcaca"
DESCRIPTION = "This package contains utilities and demonstration programs for libcaca, \
the Colour AsCii Art library. \
 \
cacaview is a simple image viewer for the terminal. It opens most image \
formats such as JPEG, PNG, GIF etc. and renders them on the terminal \
using ASCII art. The user can zoom and scroll the image, set the \
dithering method or enable anti-aliasing. \
 \
cacaball is a tiny graphic program that renders animated ASCII \
metaballs on the screen, cacafire is a port of AALib's aafire and \
displays burning ASCII art flames, and cacademo is a simple application \
that shows the libcaca rendering features such as line and ellipses \
drawing, triangle filling and sprite blitting."
LICENSE = "WTFPL"

PV = "0.99.beta20"

RPM_NAME = "caca-utils-0.99.beta20-1.4.aarch64.rpm"
RPM_HASH = "059fa92c4442486a19629f1b89e3163b52a0a97261ea72196f902eea8f6f1f703abc4e369542b08215e84e0ef12f3f7ec7ea4bd7c9df7159b6565ed672f0c79f"

RPROVIDES:${PN} += "caca-utils \
caca-utils(aarch-64)"
RDEPENDS:${PN} += "imlib2-loaders \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libImlib2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcaca.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
toilet"

inherit rpm
