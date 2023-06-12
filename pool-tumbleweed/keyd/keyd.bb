SUMMARY = "A key remapping daemon for linux"
DESCRIPTION = "Linux lacks a good key remapping solution. \
In order to achieve satisfactory results a medley of tools need to be employed \
(e.g xcape, xmodmap) with the end result often being tethered to a specified \
environment (X11). \
keyd attempts to solve this problem by providing a flexible system wide daemon \
which remaps keys using kernel level input primitives (evdev, uinput)."
LICENSE = "MIT"

PV = "2.4.3"

RPM_NAME = "keyd-2.4.3-1.1.aarch64.rpm"
RPM_HASH = "a642503c9b5113993468fb013eae09f14e5eca5d018cbc32c1452f9fa48aabcb6611fc92628929fa174a807ef3dcc84945d24592e10f87afefeaa91194606943"

RPROVIDES:${PN} += "keyd \
keyd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
libc.so.6(GLIBC_2.34)(64bit) \
python3-xlib \
sed \
shadow"

inherit rpm
