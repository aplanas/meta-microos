SUMMARY = "General Data for KDE Games"
DESCRIPTION = "This package contains data which is required by the KDE games library."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libkdegames-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "f85914b84f34212ae1b8bfa3268b147141cbf328ba6048ad3f95d49c9853f6008f1e17d1e1623145fb693b35d05e9082580f83f6382bdfb66edbf547bfe63880"

RPROVIDES:${PN} += "libkdegames \
libkdegames-kf5"

RDEPENDS:${PN} += ""

inherit rpm
