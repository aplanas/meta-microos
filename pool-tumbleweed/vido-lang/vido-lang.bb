SUMMARY = "Translations for package vido"
DESCRIPTION = "Provides translations for the 'vido' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.0"

RPM_NAME = "vido-lang-2.3.0-1.15.noarch.rpm"
RPM_HASH = "3a8aac2de32309fe48515163dd186c81a3163c5dbf87d83f7fe64862c051df31f42d26035156415b2a6f645d2169238b162f5cfb8a5be4aa5068c51308c5257b"
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
