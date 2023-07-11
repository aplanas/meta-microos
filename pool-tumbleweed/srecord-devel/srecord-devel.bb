SUMMARY = "Srecord development files"
DESCRIPTION = "This package contains libraries and header files for compiling programs \
that manipulate EPROM load files."
LICENSE = "GPL-3.0+"

PV = "1.64"

RPM_NAME = "srecord-devel-1.64-4.34.aarch64.rpm"
RPM_HASH = "89d989b99cd529903cff2fab293d3d86c9cd6fb48f37f2462b75839064d621274464d676b2f7754e359a9f7c57d74f7f3e37a9acdeacbb6693503ef7824a83cd"

RPROVIDES:${PN} += "pkgconfig-srecord \
srecord-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsrecord0"

inherit rpm
