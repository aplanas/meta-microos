SUMMARY = "A simple locker using LightDM"
DESCRIPTION = "light-locker is a simple locker that aims to have simple, sane, secure \
defaults and be well integrated with the desktop while not carrying any \
desktop-specific dependencies. \
It relies on LightDM for locking and unlocking your session via systemd."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "light-locker-1.9.0-1.15.aarch64.rpm"
RPM_HASH = "7db9657b0c562d7e75f78fa1ab00f03f456590b5fc98c30bca0a7df42d055464b5e4ccdb23e13af5d1cc6f79ce8316e16cad56ff217bb66a162ca1bf4ff97133"

RPROVIDES:${PN} += "light-locker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXss.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsystemd.so.0 \
lightdm"

inherit rpm
