SUMMARY = "Development files for liblnk, a library to access Windows Shortcut Links"
DESCRIPTION = "liblnk is a library to access Windows Shortcut File (LNK) files. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblnk."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "liblnk-devel-20230716-1.1.aarch64.rpm"
RPM_HASH = "93fc056123f4dcc0ef7d1815c694681b4216e79afc21833340ac4d27e8ab9ee9b69ea10d6686449bc602e4e16a0591d400e83a19d58e1efda50abe98017ab5fc"

RPROVIDES:${PN} += "liblnk-devel \
pkgconfig-liblnk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
liblnk1"

inherit rpm
