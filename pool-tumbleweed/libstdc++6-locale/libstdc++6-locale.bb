SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.2.1+git7683"

RPM_NAME = "libstdc++6-locale-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "07a876a96fbf86083c0ccac78ad29a2a8c9e83c97fb8b07c098499901920a1ad6a6fec7b40550e1f21d6a9e9ec7702b0b6b47e1bc2a4cd0274c4ede01b65a919"

RPROVIDES:${PN} += "libstdc++6-locale \
locale-libstdc++6-de \
locale-libstdc++6-fr"

RDEPENDS:${PN} += ""

inherit rpm
