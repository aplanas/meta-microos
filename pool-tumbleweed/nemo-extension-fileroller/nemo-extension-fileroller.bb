SUMMARY = "Fileroller support for the Nemo Filemanager"
DESCRIPTION = "Nemo-fileroller adds File-roller support to the Nemo file manager."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-fileroller-5.2.0-3.4.aarch64.rpm"
RPM_HASH = "746261f1768b600deab042b7f8ec7c1373f08f870a1e2944bea6c664fadf279e75851d292ceead7a33de1ef6ded3e5b84e7c02dd8748d5d27c2f791029d421f6"

RPROVIDES:${PN} += "libnemo-fileroller.so()(64bit) \
nemo-extension-fileroller \
nemo-extension-fileroller(aarch-64) \
nemo-fileroller"

RDEPENDS:${PN} += "/sbin/ldconfig \
file-roller \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnemo-extension.so.1()(64bit) \
nemo"

inherit rpm
