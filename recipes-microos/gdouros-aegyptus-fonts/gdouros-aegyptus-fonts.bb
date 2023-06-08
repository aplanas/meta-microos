SUMMARY = "Fonts with Support for Ancient Egyptian Hieroglyphs"
DESCRIPTION = "Aegyptus allocates Egyptian Hieroglyphs, in Plane 15 of the UCS. The main \
sources of glyphs are «Hieroglyphica», PIREI, 2000 and the work of Alan \
Gardiner. The font also covers Basic Latin, Egyptian Transliteration \
characters, the Hieratic alphabet, Coptic, Meroitic, the Gardiner set \
supported by Unicode, et al. The Gardiner set (redesigned with a thicker \
line) is also available in the small font Gardiner."
LICENSE = "SUSE-Permissive"

PV = "6.17"

RPM_NAME = "gdouros-aegyptus-fonts-6.17-1.16.noarch.rpm"
RPM_HASH = "aa747d407ecb8e712c3a29f4cb1cede5ca638c60a71238b29d192b72c39216be17dc6f3ff01653b361c8874f6f3ef0ca4e6d7b9d1ca024788513444d498912b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aegyptus-fonts gdouros-aegyptus-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
