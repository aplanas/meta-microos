SUMMARY = "Translations for package blender"
DESCRIPTION = "Provides translations for the 'blender' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "blender-lang-3.5.0-1.2.noarch.rpm"
RPM_HASH = "cb624559c1cf287ecac11579a289e8d27396e676072d32d6e612db49c9a2a553ccf9837a8a6c39625a0face742cdbd17f101a8f2fced4a9e3ba9f77f83c217af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blender-lang \
blender-lang-all \
locale(blender:ab) \
locale(blender:ar) \
locale(blender:ca) \
locale(blender:cs) \
locale(blender:de) \
locale(blender:eo) \
locale(blender:es) \
locale(blender:es_ES) \
locale(blender:eu) \
locale(blender:fa) \
locale(blender:fi) \
locale(blender:fr) \
locale(blender:ha) \
locale(blender:he) \
locale(blender:hi) \
locale(blender:hr) \
locale(blender:hu) \
locale(blender:id) \
locale(blender:it) \
locale(blender:ja) \
locale(blender:ka) \
locale(blender:ko) \
locale(blender:ky) \
locale(blender:nl) \
locale(blender:pl) \
locale(blender:pt) \
locale(blender:pt_BR) \
locale(blender:ru) \
locale(blender:sk) \
locale(blender:sr) \
locale(blender:sr@latin) \
locale(blender:sv) \
locale(blender:th) \
locale(blender:tr) \
locale(blender:uk) \
locale(blender:vi) \
locale(blender:zh_CN) \
locale(blender:zh_TW)"
RDEPENDS:${PN} += "blender"

inherit rpm
