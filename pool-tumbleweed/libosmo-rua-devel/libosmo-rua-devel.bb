SUMMARY = "Header files for the Osmocom RUA library"
DESCRIPTION = "Osmocom code for the RANAP User Adaption signalling. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-rua."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-rua-devel-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "a766e51a60f54625c1d588c46eaf1873d612715d16d31bce56e39a19392a76da02ecf8b0ee41401cea68fa7385f207f02b579b24184d6eaa7770e39ab75ed8dc"

RPROVIDES:${PN} += "libosmo-rua-devel \
pkgconfig-libosmo-rua"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-rua0"

inherit rpm
