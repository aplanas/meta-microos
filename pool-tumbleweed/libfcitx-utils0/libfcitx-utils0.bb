SUMMARY = "Util library of fcitx"
DESCRIPTION = "Util library of fcitx"
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "libfcitx-utils0-4.2.9.9-1.5.aarch64.rpm"
RPM_HASH = "c0e90495a4ad43b3ddd7d7c6c67aa3da49d8cad4688e36e1e970b653cd3ce47c1b3d5f6237ee5c844aee6e24bb4d105f60773b281fb6af02d15c77cbd3830bbb"

RPROVIDES:${PN} += "libfcitx-utils.so.0 \
libfcitx-utils0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
