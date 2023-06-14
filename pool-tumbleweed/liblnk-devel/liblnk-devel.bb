SUMMARY = "Development files for liblnk, a library to access Windows Shortcut Links"
DESCRIPTION = "liblnk is a library to access Windows Shortcut File (LNK) files. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblnk."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "liblnk-devel-20230205-1.4.aarch64.rpm"
RPM_HASH = "3390e3683f754a3ed066ad5b1bc2e757489c77804cbc3f08940d827737e7f42423d6b5a0e3e2341fca979aeb2b253e4217a2cfc8780a0ac50e8237ba45c78dcc"

RPROVIDES:${PN} += "liblnk-devel \
pkgconfig-liblnk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
liblnk1"

inherit rpm
