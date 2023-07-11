SUMMARY = "Translations for package blender"
DESCRIPTION = "Provides translations for the 'blender' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "blender-lang-3.5.1-1.2.noarch.rpm"
RPM_HASH = "cd455d5040fc04cb1eac0efd076fa9bbcfe8ee511035bc0d15cd1435ab6dc4798a0b633f2f2da783d9bb4b0cd164bd1eaf1a98d8eae626abb17ba3d36dff93d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blender-lang \
blender-lang-all \
locale-blender-ab \
locale-blender-ar \
locale-blender-ca \
locale-blender-cs \
locale-blender-de \
locale-blender-eo \
locale-blender-es \
locale-blender-es-ES \
locale-blender-eu \
locale-blender-fa \
locale-blender-fi \
locale-blender-fr \
locale-blender-ha \
locale-blender-he \
locale-blender-hi \
locale-blender-hr \
locale-blender-hu \
locale-blender-id \
locale-blender-it \
locale-blender-ja \
locale-blender-ka \
locale-blender-ko \
locale-blender-ky \
locale-blender-nl \
locale-blender-pl \
locale-blender-pt \
locale-blender-pt-BR \
locale-blender-ru \
locale-blender-sk \
locale-blender-sr \
locale-blender-sr@latin \
locale-blender-sv \
locale-blender-th \
locale-blender-tr \
locale-blender-uk \
locale-blender-vi \
locale-blender-zh-CN \
locale-blender-zh-TW"

RDEPENDS:${PN} += "blender"

inherit rpm
