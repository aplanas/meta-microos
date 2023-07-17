SUMMARY = "A TUI bluetooth manager for Linux"
DESCRIPTION = "bluetuith is a TUI-based bluetooth connection manager, which can interact with bluetooth adapters and devices. It aims to be a replacement to most bluetooth managers, like blueman. \
This project is currently in the alpha stage."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "bluetuith-0.1.6-1.1.aarch64.rpm"
RPM_HASH = "f3f04ccff44b104249d8c94b3ab8093566c28a96871c07506bd31e6ec39949408b1fa08d8e030289edef3ef56f19275fa8a0b1f5e399adf94955cbdcbb03d2bd"

RPROVIDES:${PN} += "bluetuith"

RDEPENDS:${PN} += "bluez \
dbus-1 \
libc.so.6"

inherit rpm
