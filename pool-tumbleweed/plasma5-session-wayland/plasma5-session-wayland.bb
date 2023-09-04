SUMMARY = "KDE Plasma 5 Wayland Session"
DESCRIPTION = "This package contains the startup scripts necessary to start a KDE \
Plasma 5 session with Wayland from a display manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma5-session-wayland-5.27.7-3.1.aarch64.rpm"
RPM_HASH = "50dd62138f6298ff922b9212670af63f44a98c8764658c2460a8ea6fccdc5af506cc40383bc4201f6e2ad9dc30780cf8503248e584d3411a074b170c2628c5db"

RPROVIDES:${PN} += "plasma5-session-wayland"

RDEPENDS:${PN} += "kwayland-integration \
libqt5-qtwayland \
pipewire \
plasma5-session \
xf86-input-libinput \
xorg-x11-server-wayland"

inherit rpm
