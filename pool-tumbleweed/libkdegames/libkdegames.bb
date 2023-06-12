SUMMARY = "General Data for KDE Games"
DESCRIPTION = "This package contains data which is required by the KDE games library."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libkdegames-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0c2caefc87caa279698a2ef3c4c5ced433fd56cd6b61f24afbbf3b41a919b5ab7e1bd8d8f78a4c5b6a204fa2432decb0cc42395b24a40316796b834388cde144"

RPROVIDES:${PN} += "libkdegames \
libkdegames(aarch-64) \
libkdegames-kf5"
RDEPENDS:${PN} += ""

inherit rpm
