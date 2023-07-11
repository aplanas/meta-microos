SUMMARY = "Translations for package csound"
DESCRIPTION = "Provides translations for the 'csound' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "csound-lang-6.18.1-3.2.noarch.rpm"
RPM_HASH = "f5d883a56b33e85ae91f4e68e8a1108b56c3ba3457cebed681a9f67fc752af0e51c6ef5c6637e5949f8553b5c8976eb31f161a2a9f6fab94d1866b95424f6df7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "csound-lang \
csound-lang-all \
locale-csound-de \
locale-csound-en-US \
locale-csound-es \
locale-csound-es-CO \
locale-csound-fr \
locale-csound-it \
locale-csound-ru"

RDEPENDS:${PN} += "csound"

inherit rpm
