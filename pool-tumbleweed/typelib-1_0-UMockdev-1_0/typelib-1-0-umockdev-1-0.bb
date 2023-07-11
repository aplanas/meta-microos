SUMMARY = "Introspection bindings for umockdev -- a hardware mocking tool"
DESCRIPTION = "umockdev mocks Linux devices for creating integration tests for hardware \
related libraries and programs. \
 \
This package provides the GObject Introspection bindings for the library \
umockdev."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.17"

RPM_NAME = "typelib-1_0-UMockdev-1_0-0.17.17-1.2.aarch64.rpm"
RPM_HASH = "1f944d049bd13b7c0d4ede1d442fcb241d0c10937533fbfe49eedda25735161b244d8fb9b4b6999d10bd20efac72ed345779eaa3fb6b304f593cf7988b099e5e"

RPROVIDES:${PN} += "typelib-1-0-UMockdev-1-0 \
typelib-UMockdev"

RDEPENDS:${PN} += "libumockdev.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
