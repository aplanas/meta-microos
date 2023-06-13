SUMMARY = "A TUI bluetooth manager for Linux"
DESCRIPTION = "bluetuith is a TUI-based bluetooth connection manager, which can interact with bluetooth adapters and devices. It aims to be a replacement to most bluetooth managers, like blueman. \
This project is currently in the alpha stage."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "bluetuith-0.1.3-1.4.aarch64.rpm"
RPM_HASH = "a95354a4f32c27b9fbc8ca5777f8b902b574a97b289cbcf834ac174a7a649f716cb685f210b89b7de8550f8c8a712d2aa34a5abb1df7c96a5f431c4576a82a54"

RPROVIDES:${PN} += "bluetuith \
bluetuith(aarch-64)"

RDEPENDS:${PN} += "bluez \
dbus-1 \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
