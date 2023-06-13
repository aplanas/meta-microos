SUMMARY = "Introspection bindings for umockdev -- a hardware mocking tool"
DESCRIPTION = "umockdev mocks Linux devices for creating integration tests for hardware \
related libraries and programs. \
 \
This package provides the GObject Introspection bindings for the library \
umockdev."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.17"

RPM_NAME = "typelib-1_0-UMockdev-1_0-0.17.17-1.1.aarch64.rpm"
RPM_HASH = "913a8ae4d84d5e22642be0bdb6ce160fd8fc4555de1a5549f47c6194b2ecac30a3842dea98868e011e878044d1e63276e811b1745ecf1f04fc86558d1c1f45e8"

RPROVIDES:${PN} += "typelib(UMockdev) \
typelib-1_0-UMockdev-1_0 \
typelib-1_0-UMockdev-1_0(aarch-64)"

RDEPENDS:${PN} += "libumockdev.so.0()(64bit) \
typelib(GLib) \
typelib(GObject)"

inherit rpm
