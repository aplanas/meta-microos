SUMMARY = "Development files for the unicap library"
DESCRIPTION = "This package includes header files and libraries necessary for \
developing programs which use the unicap, unicapgtk, and ucil libraries. It \
contains the API documentation of the library, too."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.12"

RPM_NAME = "libunicap-devel-0.9.12-22.14.aarch64.rpm"
RPM_HASH = "1b1e86f181f98a0129330578a447e896fc47c59f0ad96a43ed2644a9d93a994f910142089dd141cb5dea193ff0a47f9ace2421b1692548bf2a8b28cff63f2eea"

RPROVIDES:${PN} += "libunicap-devel \
libunicap-devel(aarch-64) \
pkgconfig(libunicap)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libunicap2"

inherit rpm
