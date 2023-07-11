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

RPM_NAME = "caca-utils-0.99.beta20-1.5.aarch64.rpm"
RPM_HASH = "c24bc9e9cfa12ca72479e32500644eaeb16be44c9c36142e5911e73865446d88c877ae98b9767908db8c85974e9ee59ec3742797e99bf1ccd8939b32f7251188"

RPROVIDES:${PN} += "caca-utils"

RDEPENDS:${PN} += "imlib2-loaders \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libc.so.6 \
libcaca.so.0 \
libm.so.6 \
toilet"

inherit rpm
