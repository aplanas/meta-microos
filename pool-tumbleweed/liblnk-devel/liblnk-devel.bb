SUMMARY = "Development files for liblnk, a library to access Windows Shortcut Links"
DESCRIPTION = "liblnk is a library to access Windows Shortcut File (LNK) files. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblnk."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "liblnk-devel-20230205-1.7.aarch64.rpm"
RPM_HASH = "c307997f85c4a1d8956207ea584360750b4d262188ad5f4578d29a75d0da7a435febfee7ca1e85fb7e8a735644c583ed39f680cb4b955430968b14a0d32fe1f8"

RPROVIDES:${PN} += "liblnk-devel \
pkgconfig-liblnk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
liblnk1"

inherit rpm
