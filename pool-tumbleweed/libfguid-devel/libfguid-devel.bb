SUMMARY = "Development files for libfguid, a GUID/UUID data type library"
DESCRIPTION = "A library for GUID/UUID data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfguid."
LICENSE = "LGPL-3.0-or-later"

PV = "20220113"

RPM_NAME = "libfguid-devel-20220113-3.3.aarch64.rpm"
RPM_HASH = "3927cc53cc4446cd3f6c6889dde0a3d71e220667d6cf5db7cf023eda7fe4a7dd6c7a15c14520a256b8d786128ff8d60be897c708bf46f863d2183ce58799136a"

RPROVIDES:${PN} += "libfguid-devel \
pkgconfig-libfguid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfguid1"

inherit rpm
