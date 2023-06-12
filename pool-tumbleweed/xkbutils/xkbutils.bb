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

RPM_NAME = "xkbutils-1.0.5-1.4.aarch64.rpm"
RPM_HASH = "da51e5a1de1bcf9c495468a264aba5d538cee9392f0b995732ea398d651cd14be76ec734864c55fbfa8611590ce8d4dfa3c72eec16325ff351b93947b78a5ce8"

RPROVIDES:${PN} += "xkbutils \
xkbutils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
