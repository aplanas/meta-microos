SUMMARY = "Translations for package deepin-image-viewer"
DESCRIPTION = "Provides translations for the 'deepin-image-viewer' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.9.9"

RPM_NAME = "deepin-image-viewer-lang-5.9.9-1.3.noarch.rpm"
RPM_HASH = "f31fbdb0335fa01ffe2b9d371143cbdaafcfa7a55699323caf83b9b57d363e5c9a0468ab19c88726188f41e4ca76e4945f4a8bc3f91bc03a460da08283bcaeed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-image-viewer-lang \
deepin-image-viewer-lang-all"
RDEPENDS:${PN} += "deepin-image-viewer"

inherit rpm
