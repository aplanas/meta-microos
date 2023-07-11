SUMMARY = "Development files for the Osmocom sigtran library"
DESCRIPTION = "Osmocom implementation of (parts of) SIGTRAN. \
 \
This subpackage contains the development files for the Osmocom \
SIGTRAN library."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmo-sigtran-devel-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "696e4d33cb0d2f7abd19a89d487805ec16dcca1d5bbea54a4dccb8d5937f9b528e68c54c4e1bc8bc0da3a4338858778e51d4d54c1ba140e455ba2e7ff39df1d8"

RPROVIDES:${PN} += "libosmo-sigtran-devel \
pkgconfig-libosmo-sigtran"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-sigtran7"

inherit rpm
