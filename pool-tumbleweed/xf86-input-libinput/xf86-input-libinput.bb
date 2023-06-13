SUMMARY = "Libinput driver for the Xorg X server"
DESCRIPTION = "xf86-input-libinput is a libinput-based X.Org driver. The actual driver bit \
is quite limited, most of the work is done by libinput, the driver itself \
passes on the events (and wrangles them a bit where needed)."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "xf86-input-libinput-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "340249a470d6b916bfb038c541882ce0b9e81893685f1561a60106da3649c1399faf25ed69161a6e25cde507511a393e0e13eed6fdb1d75380639764d937b2ed"

RPROVIDES:${PN} += "libinput_drv.so()(64bit) \
xf86-input-libinput \
xf86-input-libinput(aarch-64)"

RDEPENDS:${PN} += "X11_ABI_XINPUT \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libinput.so.10()(64bit)"

inherit rpm
