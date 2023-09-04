SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.2.1+git7683"

RPM_NAME = "libstdc++6-locale-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "9a7eb7701484b6054189be3f2a608cf853fdd868f04104fa7727d138e851c2b375b34031261dd303f5411c704967126bb809a87a34101373e3a0eda337479c70"

RPROVIDES:${PN} += "libstdc++6-locale \
locale-libstdc++6-de \
locale-libstdc++6-fr"

RDEPENDS:${PN} += ""

inherit rpm
