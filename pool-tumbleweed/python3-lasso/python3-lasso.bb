SUMMARY = "Liberty Alliance Single Sign On (lasso) Python bindings"
DESCRIPTION = "Python language bindings for the lasso (Liberty Alliance Single Sign On) \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.2"

RPM_NAME = "python3-lasso-2.8.2-1.3.aarch64.rpm"
RPM_HASH = "45a6468044f4596d95f34d56e3fcfdaa4be058c2f71019fdc4a80cacd8480c822d5c3326fa7c3e0465933bc6610f940bce966ea1f19db705b46095c2bd5cc795"

RPROVIDES:${PN} += "python3-lasso \
python3-lasso(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
liblasso.so.3()(64bit) \
liblasso3(aarch-64) \
libxml2.so.2()(64bit) \
python(abi) \
python3"

inherit rpm
