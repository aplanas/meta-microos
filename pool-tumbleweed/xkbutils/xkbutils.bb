SUMMARY = "Collection of small utilities utilizing the X11 XKeyboard extension"
DESCRIPTION = "xkbutils is a collection of small utilities utilizing the XKeyboard \
(XKB) extension to the X11 protocol. \
 \
It includes: \
 xkbbell  - generate XKB bell events \
 xkbvleds - display the state of LEDs on an XKB keyboard in a window \
 xkbwatch - reports changes in the XKB keyboard state"
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "xkbutils-1.0.5-1.5.aarch64.rpm"
RPM_HASH = "b17c7c327588f7d789608441fda66144c7adf811844ef0f8cee27c86324513083bf3ca0eaddf9a7c4d2a6d096b162c7abed09d834f204fd2332b42cd9701cf10"

RPROVIDES:${PN} += "xkbutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6"

inherit rpm
