SUMMARY = "DEC-VT terminal emulator state machine"
DESCRIPTION = "TSM is a state machine for DEC VT100-VT520 compatible terminal \
emulators. It can be used to implement terminal emulators, or other \
applications that need to interpret terminal escape sequences. The \
library does no rendering or window management of its own, and does \
not depend on a graphics stack, unlike the similar GNOME libvte."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "libtsm4-4.0.2-1.4.aarch64.rpm"
RPM_HASH = "a4e0de44482e9b95160ab5294e9ca8842960310ae5a059a8da818b4659a1663e0d53e7b3c90f1bbb1d54d74ab26248e185eb399c8a23f7dc178a64f2d50157cb"

RPROVIDES:${PN} += "libtsm.so.4 \
libtsm4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
