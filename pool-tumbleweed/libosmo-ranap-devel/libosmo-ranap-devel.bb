SUMMARY = "Header files for the Osmocom RANAP library"
DESCRIPTION = "Osmocom code for the Radio Access Network Application Part of the Iu-h \
interface. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-ranap."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-ranap-devel-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "a369b8db4fb3f4d794c3ab5563cd23ccfc20fc13fd8ba411b1e68ae8f7feceba267914a6797076d473bbb019e4b7531d634467e30fe786574bf0c7b6d1f319d2"

RPROVIDES:${PN} += "libosmo-ranap-devel \
libosmo-ranap-devel(aarch-64) \
pkgconfig(libosmo-ranap)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-ranap7"

inherit rpm
