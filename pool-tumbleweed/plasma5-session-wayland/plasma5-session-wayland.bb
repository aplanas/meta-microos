SUMMARY = "KDE Plasma 5 Wayland Session"
DESCRIPTION = "This package contains the startup scripts necessary to start a KDE \
Plasma 5 session with Wayland from a display manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma5-session-wayland-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "9147d69af8e6b2c88113ad758b3fbb4f44ac709195cdae0a5d75df42aac1723fcc6787fbd560384d713de11be8a0234f310761649b6e72844f726bb15c6fb9ed"

RPROVIDES:${PN} += "plasma5-session-wayland"

RDEPENDS:${PN} += "kwayland-integration \
libqt5-qtwayland \
pipewire \
plasma5-session \
xf86-input-libinput \
xorg-x11-server-wayland"

inherit rpm
