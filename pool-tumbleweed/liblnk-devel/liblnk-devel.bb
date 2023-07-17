SUMMARY = "Development files for liblnk, a library to access Windows Shortcut Links"
DESCRIPTION = "liblnk is a library to access Windows Shortcut File (LNK) files. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblnk."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "liblnk-devel-20230205-1.8.aarch64.rpm"
RPM_HASH = "9cb5433ba9c63cdc4e0bde4449bacea79ac5bb272118a9f994720153a8bcd3633245eba9e035aaa253797ccd711213b48844738986d0346455d4642d9e07d091"

RPROVIDES:${PN} += "liblnk-devel \
pkgconfig-liblnk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
liblnk1"

inherit rpm
