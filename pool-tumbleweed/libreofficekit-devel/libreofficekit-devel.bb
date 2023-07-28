SUMMARY = "Development files for libreofficekit"
DESCRIPTION = "The libreofficekit-devel package contains libraries and header files for \
developing applications that use libreofficekit."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreofficekit-devel-7.5.4.2-1.5.aarch64.rpm"
RPM_HASH = "2394fd3b72028d10d14f50ecd23570bf17e57a1e9c1178c533a3634251a64a533ff53c5fcc8ff447fb5077824a1ab22fc96945650ce5526bc2b68178b97375ae"

RPROVIDES:${PN} += "libreofficekit-devel"

RDEPENDS:${PN} += "libreofficekit"

inherit rpm
