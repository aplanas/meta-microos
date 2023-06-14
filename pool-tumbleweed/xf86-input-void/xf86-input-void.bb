SUMMARY = "Null input driver for the Xorg X server"
DESCRIPTION = "void is an dummy/null Xorg input driver. It doesn't connect to any \
physical device, and it never delivers any events. It functions as both \
a pointer and keyboard device, and may be used as X server's core \
pointer and/or core keyboard. Its purpose is to allow X servers pre \
version 1.4 to operate without a core pointer and/or core keyboard."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "xf86-input-void-1.4.2-1.2.aarch64.rpm"
RPM_HASH = "732f16fc93382372bcb7fe49a7deddd90d58d8f0dac9c95448df1d13a62aced793e5084c5a3a3a9bf643e035f7a82426b716b739d1d6354bc5fe7ed4b2d4a018"

RPROVIDES:${PN} += "xf86-input-void"

RDEPENDS:${PN} += "/bin/sh \
X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libc.so.6 \
udev"

inherit rpm
