SUMMARY = "Python3 gobject-introspection bindings for the LibBlockDev library"
DESCRIPTION = "This package contains enhancements to the gobject-introspection bindings for \
LibBlockDev in Python3."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "python3-libblockdev-2.28-1.6.aarch64.rpm"
RPM_HASH = "33d7ff0259a8a7e4566f63d21c44a635c3969090fdaedd8a9ffd2717f9ca64d3b1d50b80f01e312c04cc649b8e2a84ad7c662cca9d02506168e5e7811c1e1cb3"

RPROVIDES:${PN} += "python3-libblockdev"

RDEPENDS:${PN} += "libblockdev2 \
python-abi \
python3-gobject \
typelib-GLib"

inherit rpm
