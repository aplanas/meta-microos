SUMMARY = "Translation of man pages in German"
DESCRIPTION = "This package provides translations of man pages in German."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-de-4.20.0-1.1.noarch.rpm"
RPM_HASH = "3df6acd95a3824d34da07dc3afc21c880abe8681c90f8d7f1e5de5b39414ddd00fea4bc08192074e9a4793ec3e5121516a37552cf033eb9f3de6ce380dfc9d9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-de \
man-pages-de"

RDEPENDS:${PN} += "man-pages"

inherit rpm
