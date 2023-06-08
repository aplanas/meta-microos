SUMMARY = "A TUI bluetooth manager for Linux"
DESCRIPTION = "bluetuith is a TUI-based bluetooth connection manager, which can interact with bluetooth adapters and devices. It aims to be a replacement to most bluetooth managers, like blueman. \
This project is currently in the alpha stage."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "bluetuith-0.1.3-1.3.aarch64.rpm"
RPM_HASH = "72a6c015422b38864a9db2cbf2072d3ec1752fa4d6aa1059eac6ee4991e0f702a56b9be154e663bd5dff125963b351008680cb461248326af0b1a29fc202ad76"

RPROVIDES:${PN} += "bluetuith bluetuith(aarch-64)"
RDEPENDS:${PN} += "bluez dbus-1 libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
