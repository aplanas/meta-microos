SUMMARY = "Translations for package deepin-music-player"
DESCRIPTION = "Provides translations for the 'deepin-music-player' package."
LICENSE = "GPL-3.0-or-later"

PV = "6.2.18"

RPM_NAME = "deepin-music-player-lang-6.2.18-1.6.noarch.rpm"
RPM_HASH = "32c2f25877939df8b3b06b514d254aff40362b6d88ff36bdb5d1c106c5f56958a720b6ac5cdf0c399e4f77a52d8243f5f3cf64d59e90579a50bbe2c762c3401b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-music-player-lang \
deepin-music-player-lang-all"
RDEPENDS:${PN} += "deepin-music-player"

inherit rpm
