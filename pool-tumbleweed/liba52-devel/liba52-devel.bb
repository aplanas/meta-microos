SUMMARY = "Header files for the a52dec library"
DESCRIPTION = "Header files and static library for the a52dec library. \
Install this package if you want to compile programs using the library."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.5+svn613"

RPM_NAME = "liba52-devel-0.7.5+svn613-3.17.aarch64.rpm"
RPM_HASH = "f0ad20f33f74ad16fb211fc72c3868891fc06b5da9a0050f854ff32e158f8353e5d40f9a201f4d12653432279c6219cfb0c359d662ab3c4640416b92cacafd15"

RPROVIDES:${PN} += "a52dec-devel \
liba52-devel \
liba52dec-devel \
pkgconfig-liba52"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liba52-0"

inherit rpm
