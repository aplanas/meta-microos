SUMMARY = "Development files for the libxkbcommon-x11 library"
DESCRIPTION = "xkbcommon is a keymap handling library, which can parse XKB \
descriptions (e.g. from xkeyboard-config), and use this to help its \
users make sense of their keyboard input. \
 \
This package contains the development headers for the library found \
in libxkbcommon-x11-0."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libxkbcommon-x11-devel-1.5.0-1.4.aarch64.rpm"
RPM_HASH = "117056b9c4e7ad2f9da4202823e3dcb155a76c87b47d2548bef67489ba1000f4ce92f9250da78a8e3b2c89e014242b6e206313bad115a7ae398d6ef50c5c95a8"

RPROVIDES:${PN} += "libxkbcommon-x11-devel \
pkgconfig-xkbcommon-x11"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxkbcommon-x11-0 \
pkgconfig-xcb \
pkgconfig-xcb-xkb \
pkgconfig-xkbcommon"

inherit rpm
