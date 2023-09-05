SUMMARY = "A TUI bluetooth manager for Linux"
DESCRIPTION = "bluetuith is a TUI-based bluetooth connection manager, which can interact with bluetooth adapters and devices. It aims to be a replacement to most bluetooth managers, like blueman. \
This project is currently in the alpha stage."
LICENSE = "MIT"

PV = "0.1.7"

RPM_NAME = "bluetuith-0.1.7-1.1.aarch64.rpm"
RPM_HASH = "e4bbbd2d56d48c502502c8fd57c44d539ff29210820d4301b25d2590186186d2c8d206294c7e165087f216ffd206bef578851f35c3602729077d1dd38aae524c"

RPROVIDES:${PN} += "bluetuith"

RDEPENDS:${PN} += "bluez \
dbus-1 \
libc.so.6"

inherit rpm
