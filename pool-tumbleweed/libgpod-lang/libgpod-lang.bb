SUMMARY = "Translations for package libgpod"
DESCRIPTION = "Provides translations for the 'libgpod' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libgpod-lang-0.8.3-12.7.noarch.rpm"
RPM_HASH = "577fd64dcf22957746df3399a9ad5e0b5d6dbc3dabcc59b99500c070f66afa0a7d791f8458bb769d6bf5f53853bf74e32bda6ea62dd3dd0b9d2b9a6348ddbd9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgpod-lang \
libgpod-lang-all \
locale-libgpod-de \
locale-libgpod-es \
locale-libgpod-fr \
locale-libgpod-he \
locale-libgpod-it \
locale-libgpod-ja \
locale-libgpod-ro \
locale-libgpod-sv \
locale-libgpod-zh-CN"

RDEPENDS:${PN} += "libgpod"

inherit rpm
