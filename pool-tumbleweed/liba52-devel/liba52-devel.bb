SUMMARY = "Header files for the a52dec library"
DESCRIPTION = "Header files and static library for the a52dec library. \
Install this package if you want to compile programs using the library."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "liba52-devel-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "df41283062706ae0b757ecae7612eaee18cc116b729b7c06936836ff469a8b72cd30f98dbe4eda46a39b304a92c61defcb58574ff02dccbabc484824fa8f011a"

RPROVIDES:${PN} += "a52dec-devel \
liba52-devel \
liba52dec-devel \
pkgconfig-liba52"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liba52-0"

inherit rpm
