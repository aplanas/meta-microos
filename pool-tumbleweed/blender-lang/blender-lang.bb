SUMMARY = "Translations for package blender"
DESCRIPTION = "Provides translations for the 'blender' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.2"

RPM_NAME = "blender-lang-3.6.2-1.1.noarch.rpm"
RPM_HASH = "533595035630e4ff0539b800354fe09a2db21d8bd4ed38cd9a5ef88ae999ddcd316d546446d7c1d2d1cb58b25ab080c81379d160113e7fe8c517bcbec3a00f8a"
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
