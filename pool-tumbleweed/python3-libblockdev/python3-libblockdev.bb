SUMMARY = "Python3 gobject-introspection bindings for the LibBlockDev library"
DESCRIPTION = "This package contains enhancements to the gobject-introspection bindings for \
LibBlockDev in Python3."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "python3-libblockdev-2.28-1.4.aarch64.rpm"
RPM_HASH = "ad25989d5f8d285962fe478d4f7d98c4243aab3cf0532deed515535306e52559bd1dcaefe1dfe40e6164ee512c1aca60d1056875c710757bf196551ab0e322ce"

RPROVIDES:${PN} += "python3-libblockdev"

RDEPENDS:${PN} += "libblockdev2 \
python-abi \
python3-gobject \
typelib-GLib"

inherit rpm
