SUMMARY = "DEC-VT terminal emulator state machine"
DESCRIPTION = "TSM is a state machine for DEC VT100-VT520 compatible terminal \
emulators. It can be used to implement terminal emulators, or other \
applications that need to interpret terminal escape sequences. The \
library does no rendering or window management of its own, and does \
not depend on a graphics stack, unlike the similar GNOME libvte."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "libtsm4-4.0.2-1.3.aarch64.rpm"
RPM_HASH = "6b5f9035ea288bacb7928626ec50f8a3d17e41680ec107b7aae6884770502ae816cf59fe3188ff237b93c3d33470f008f91d45f54a3e8c94f123f31a8faace57"

RPROVIDES:${PN} += "libtsm.so.4()(64bit) \
libtsm.so.4(LIBTSM_1)(64bit) \
libtsm.so.4(LIBTSM_2)(64bit) \
libtsm.so.4(LIBTSM_3)(64bit) \
libtsm.so.4(LIBTSM_4)(64bit) \
libtsm4 \
libtsm4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
