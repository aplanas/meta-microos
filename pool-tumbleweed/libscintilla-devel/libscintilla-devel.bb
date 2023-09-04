SUMMARY = "Development files for Scintilla, a code editing component"
DESCRIPTION = "Scintilla is a code editing component. It includes features for \
editing and debugging source code, such as syntax styling, error \
indicators, code completion and call tips. \
 \
This subpackage contains the header files for developing \
applications that want to make use of the Scintilla library."
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "libscintilla-devel-5.3.6-1.1.aarch64.rpm"
RPM_HASH = "f8c045418b8a133257e427e03c72632574f84ed2a24620f6115104287baf99a238e1e0bb9d8f5b4c915bbf9e5707530b2153bf6515ff80a8c94aa3bae531c60b"

RPROVIDES:${PN} += "libscintilla-devel"

RDEPENDS:${PN} += "libscintilla5 \
pkgconfig \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
