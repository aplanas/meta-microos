SUMMARY = "Translations for package deepin-movie"
DESCRIPTION = "Provides translations for the 'deepin-movie' package."
LICENSE = "GPL-3.0-or-later & OpenSSL"

PV = "5.10.8"

RPM_NAME = "deepin-movie-lang-5.10.8-1.5.noarch.rpm"
RPM_HASH = "db7fa725c0883cdb38904720cc9152aa260d0aef4a0e78eefb4ae42431686232a8280b2e030a1f3f3a44f3d9da79685bb49773690a937df424b5ea757ed3c59f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-movie-lang \
deepin-movie-lang-all"
RDEPENDS:${PN} += "deepin-movie"

inherit rpm
