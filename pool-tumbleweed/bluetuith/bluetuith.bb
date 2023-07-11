SUMMARY = "A TUI bluetooth manager for Linux"
DESCRIPTION = "bluetuith is a TUI-based bluetooth connection manager, which can interact with bluetooth adapters and devices. It aims to be a replacement to most bluetooth managers, like blueman. \
This project is currently in the alpha stage."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "bluetuith-0.1.5-1.1.aarch64.rpm"
RPM_HASH = "3de287a2578d928425b4d0d5a440d3f4c1849c304b7574cff1b38150916708b9db6accdc302161d478513beea4f1e27a8bef47a6deaa67fd17acc0275d28ff9d"

RPROVIDES:${PN} += "bluetuith"

RDEPENDS:${PN} += "bluez \
dbus-1 \
libc.so.6"

inherit rpm
