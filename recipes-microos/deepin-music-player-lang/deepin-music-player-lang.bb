SUMMARY = "Translations for package deepin-music-player"
DESCRIPTION = "Provides translations for the 'deepin-music-player' package."
LICENSE = "GPL-3.0-or-later"

PV = "6.2.18"

RPM_NAME = "deepin-music-player-lang-6.2.18-1.5.noarch.rpm"
RPM_HASH = "977f4ee0a90c8399e8625feac9b73a58e567043293d1a588d716a9829225fc89cfcca3d419b9a95c29599fe888d33fecab7177c68df32dc27b78de77bf9ac554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-music-player-lang deepin-music-player-lang-all"
RDEPENDS:${PN} += "deepin-music-player"

inherit rpm
