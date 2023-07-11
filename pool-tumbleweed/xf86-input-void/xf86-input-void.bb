SUMMARY = "Null input driver for the Xorg X server"
DESCRIPTION = "void is an dummy/null Xorg input driver. It doesn't connect to any \
physical device, and it never delivers any events. It functions as both \
a pointer and keyboard device, and may be used as X server's core \
pointer and/or core keyboard. Its purpose is to allow X servers pre \
version 1.4 to operate without a core pointer and/or core keyboard."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "xf86-input-void-1.4.2-1.3.aarch64.rpm"
RPM_HASH = "22265697ec9f50a5cc398050cbbda1bec20d84b47660aac81f61c99746e690d4a704509d7898c8ade0c4c8f3a0e6bf2bbfb8fd22c9c3a5d1caf8cb36bac7bca3"

RPROVIDES:${PN} += "xf86-input-void"

RDEPENDS:${PN} += "/usr/bin/sh \
X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libc.so.6 \
udev"

inherit rpm
