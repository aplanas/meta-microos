SUMMARY = "Translations for package deepin-movie"
DESCRIPTION = "Provides translations for the 'deepin-movie' package."
LICENSE = "GPL-3.0-or-later & OpenSSL"

PV = "5.10.8"

RPM_NAME = "deepin-movie-lang-5.10.8-1.6.noarch.rpm"
RPM_HASH = "7ecfbd098526e49db3a303f8ab00eff9e3caf0fc195ac781649bf3c0fd35a50ac5a86b82de045d03f68b610976a43f2cd62fa2ddf111c24582bee51e35380bcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-movie-lang \
deepin-movie-lang-all"

RDEPENDS:${PN} += "deepin-movie"

inherit rpm
