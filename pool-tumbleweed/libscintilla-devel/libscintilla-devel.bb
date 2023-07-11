SUMMARY = "Development files for Scintilla, a code editing component"
DESCRIPTION = "Scintilla is a code editing component. It includes features for \
editing and debugging source code, such as syntax styling, error \
indicators, code completion and call tips. \
 \
This subpackage contains the header files for developing \
applications that want to make use of the Scintilla library."
LICENSE = "MIT"

PV = "5.3.5"

RPM_NAME = "libscintilla-devel-5.3.5-1.1.aarch64.rpm"
RPM_HASH = "ec56900aad19ad4c2bea89f14660e1e22da42381eb5fbd4df2a54d568cda1e84f7c8b0230f0b04e5ead2af0b01d183b9f708922aa7a785c2bda706c6609e6658"

RPROVIDES:${PN} += "libscintilla-devel"

RDEPENDS:${PN} += "libscintilla5 \
pkgconfig \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
