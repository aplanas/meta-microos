SUMMARY = "KDE Plasma 5 Wayland Session"
DESCRIPTION = "This package contains the startup scripts necessary to start a KDE \
Plasma 5 session with Wayland from a display manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "plasma5-session-wayland-5.27.6-2.1.aarch64.rpm"
RPM_HASH = "bd87e3d4d7f2e01af2e3d14fe778c63e1f6a0d3c83860bf84498b62726b61a7d9125cb724ad721890e87a4a320a15e492bf57cac65d6733beb2f1e4aa4e268ea"

RPROVIDES:${PN} += "plasma5-session-wayland"

RDEPENDS:${PN} += "kwayland-integration \
libqt5-qtwayland \
pipewire \
plasma5-session \
xf86-input-libinput \
xorg-x11-server-wayland"

inherit rpm
