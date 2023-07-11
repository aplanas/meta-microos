SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libstdc++6-gcc12-locale-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "3cb3ee8243e8f67def95cc38e51438ac97c82422e638c7bcaa097e2410c08b0bf7aa4c69d265e86bcfc411f80594ad78622a638118e917aef74f92c9e5e3f2d9"

RPROVIDES:${PN} += "libstdc++6-gcc12-locale \
libstdc++6-locale \
locale-libstdc++6-gcc12-de \
locale-libstdc++6-gcc12-fr"

RDEPENDS:${PN} += ""

inherit rpm
