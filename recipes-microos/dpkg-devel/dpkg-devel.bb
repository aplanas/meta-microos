SUMMARY = "Development files for dpkg"
DESCRIPTION = "Libraries and header files for dpkg."
LICENSE = "GPL-2.0-or-later"

PV = "1.21.8"

RPM_NAME = "dpkg-devel-1.21.8-1.6.aarch64.rpm"
RPM_HASH = "923486df0e6c327d9afcd85f70975f291e252e109b645d78cdbd4cb5a57eea4b31bd987afc9cc1ae0866db4ff9228165e56e8c855f881511bc274c3bb753e102"

RPROVIDES:${PN} += "deb-devel dpkg-devel dpkg-devel(aarch-64) pkgconfig(libdpkg)"
RDEPENDS:${PN} += "/usr/bin/pkg-config dpkg libmd-devel"

inherit rpm
