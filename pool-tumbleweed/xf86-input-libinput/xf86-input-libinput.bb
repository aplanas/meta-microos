SUMMARY = "Libinput driver for the Xorg X server"
DESCRIPTION = "xf86-input-libinput is a libinput-based X.Org driver. The actual driver bit \
is quite limited, most of the work is done by libinput, the driver itself \
passes on the events (and wrangles them a bit where needed)."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "xf86-input-libinput-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "7cda1d304b46c80985ac234000152528f21ed2206539b0a237fd949b11c139ec7e6b7a789c63371e8a036a647afb0946351b60c144bae5c130d28291c6ce0b0e"

RPROVIDES:${PN} += "libinput-drv.so \
xf86-input-libinput"

RDEPENDS:${PN} += "X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libc.so.6 \
libinput.so.10"

inherit rpm
