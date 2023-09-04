SUMMARY = "Development files for liblnk, a library to access Windows Shortcut Links"
DESCRIPTION = "liblnk is a library to access Windows Shortcut File (LNK) files. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblnk."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "liblnk-devel-20230716-2.1.aarch64.rpm"
RPM_HASH = "64508c2dc39c84013853034ced3dd45caf6ff4dfe205ccb2fbb29a0563a5f92ade83f2ff2e5a627b1d244a7f50f7c4f47b59c4d0dc39ce7699040bb2660e0991"

RPROVIDES:${PN} += "liblnk-devel \
pkgconfig-liblnk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
liblnk1"

inherit rpm
