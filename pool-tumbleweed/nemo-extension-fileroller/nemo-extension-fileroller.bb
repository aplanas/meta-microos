SUMMARY = "Fileroller support for the Nemo Filemanager"
DESCRIPTION = "Nemo-fileroller adds File-roller support to the Nemo file manager."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-fileroller-5.2.0-3.6.aarch64.rpm"
RPM_HASH = "3aae2f4dfce81d5b669190d9edb71626028237fa8ff203ac20564663233421f9b3f6cfa9d1492a8d7b3d6eb030839bba6d9250794acb493c0d0176952d084b95"

RPROVIDES:${PN} += "libnemo-fileroller.so \
nemo-extension-fileroller \
nemo-fileroller"

RDEPENDS:${PN} += "/sbin/ldconfig \
file-roller \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnemo-extension.so.1 \
nemo"

inherit rpm
