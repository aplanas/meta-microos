SUMMARY = "Python bindings for the libsignon-glib library"
DESCRIPTION = "This package contains the python bindings for the libsignon-glib \
management library."
LICENSE = "LGPL-2.1-only"

PV = "2.1"

RPM_NAME = "python3-libsignon-glib-2.1-1.18.aarch64.rpm"
RPM_HASH = "9f240ced5f2bf23e41655005c4d863114f8b1bd5824dbb6a50676404660c8a7c2bc8ad2445dc1c1375612486683bf8d6bb072fcb36d2aaeaece5109e26f4c1eb"

RPROVIDES:${PN} += "python3-libsignon-glib"

RDEPENDS:${PN} += "python-abi \
typelib-GObject"

inherit rpm
