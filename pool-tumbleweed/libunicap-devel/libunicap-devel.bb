SUMMARY = "Development files for the unicap library"
DESCRIPTION = "This package includes header files and libraries necessary for \
developing programs which use the unicap, unicapgtk, and ucil libraries. It \
contains the API documentation of the library, too."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.12"

RPM_NAME = "libunicap-devel-0.9.12-22.15.aarch64.rpm"
RPM_HASH = "efbe3599d5c47109752b1f29b704cc0c118869fdd69e9c3d664d371d231b4d025f3ca291f8374261f1c75b9028a387a944a9879261ff5b1d4831d444032424c9"

RPROVIDES:${PN} += "libunicap-devel \
pkgconfig-libunicap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libunicap2"

inherit rpm
