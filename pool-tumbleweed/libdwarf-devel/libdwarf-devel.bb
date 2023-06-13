SUMMARY = "Development files for libdwarf"
DESCRIPTION = "Contains the static libraries and header files of libdwarf. \
 \
libdwarf is a library of functions to provide read/write DWARF \
debugging records."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.0"

RPM_NAME = "libdwarf-devel-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "995283942e1e86f262a3a63efe5a4c5282b267a04ff21c228700930c59d6596a1f2ec8ea586e702ccde64afe3b62d690d6263eeddcd3981510d47aaf439d282d"

RPROVIDES:${PN} += "libdwarf-devel \
libdwarf-devel(aarch-64) \
pkgconfig(libdwarf)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdwarf0 \
libelf-devel \
pkgconfig(libzstd) \
pkgconfig(zlib)"

inherit rpm
