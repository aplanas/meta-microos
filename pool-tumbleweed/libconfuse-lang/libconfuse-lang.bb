SUMMARY = "Translations for package libconfuse"
DESCRIPTION = "Provides translations for the 'libconfuse' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3"

RPM_NAME = "libconfuse-lang-3.3-2.4.noarch.rpm"
RPM_HASH = "2c75a76100a604220201ddddae0e45160524a2c939845678cb211b312262aabae8027a03b559a1468f9e7a9cb5e3d71b4f1fd7260062a77971f68e5d1abe983e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libconfuse-lang \
libconfuse-lang-all \
locale-libconfuse-de \
locale-libconfuse-fr \
locale-libconfuse-sv"

RDEPENDS:${PN} += "libconfuse2"

inherit rpm
