SUMMARY = "Translations for package blobwars"
DESCRIPTION = "Provides translations for the 'blobwars' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.00"

RPM_NAME = "blobwars-lang-2.00-3.1.noarch.rpm"
RPM_HASH = "0044cdacd191f7df420cf89b28157ac8800bd281d4ae019c333b0c6dbcdcc3d20487793f7e5ea67ecd7ea283d7a4ebfd5a5ee3df5548adb68a5507da5686b9bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blobwars-lang \
blobwars-lang-all \
locale-blobwars-ca \
locale-blobwars-da \
locale-blobwars-de \
locale-blobwars-es \
locale-blobwars-fr \
locale-blobwars-nl \
locale-blobwars-pl \
locale-blobwars-sv"

RDEPENDS:${PN} += "blobwars"

inherit rpm
