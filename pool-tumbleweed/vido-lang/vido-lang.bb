SUMMARY = "Translations for package vido"
DESCRIPTION = "Provides translations for the 'vido' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.0"

RPM_NAME = "vido-lang-2.3.0-1.14.noarch.rpm"
RPM_HASH = "8636a141bc18eb54b669a6f0876669eb504cc6daebce988e84f4c1b0ae5280a523ed984076058e52020fce1a4461e0cb9f5893f44f8416dfcdd8394c6a80da07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-vido-es \
locale-vido-fr \
locale-vido-id \
locale-vido-it \
locale-vido-ja \
locale-vido-lt \
locale-vido-nl \
locale-vido-ru \
vido-lang \
vido-lang-all"

RDEPENDS:${PN} += "vido"

inherit rpm
