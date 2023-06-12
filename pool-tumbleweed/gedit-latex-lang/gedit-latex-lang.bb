SUMMARY = "Translations for package gedit-latex"
DESCRIPTION = "Provides translations for the 'gedit-latex' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.20.0"

RPM_NAME = "gedit-latex-lang-3.20.0-4.16.noarch.rpm"
RPM_HASH = "e1081f7c4990dd89d26fd16cfe510e121f1ed113f95bf24cb9ec464fe1701fe43a618dc36acb9939ed72e1ed2f5a6d70fc5a0aa27162160831a706a6487536d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gedit-latex-lang \
gedit-latex-lang-all \
locale(gedit-latex:bs) \
locale(gedit-latex:ca) \
locale(gedit-latex:cs) \
locale(gedit-latex:da) \
locale(gedit-latex:de) \
locale(gedit-latex:el) \
locale(gedit-latex:eo) \
locale(gedit-latex:es) \
locale(gedit-latex:eu) \
locale(gedit-latex:fr) \
locale(gedit-latex:gl) \
locale(gedit-latex:hu) \
locale(gedit-latex:id) \
locale(gedit-latex:it) \
locale(gedit-latex:ko) \
locale(gedit-latex:lv) \
locale(gedit-latex:nb) \
locale(gedit-latex:oc) \
locale(gedit-latex:pl) \
locale(gedit-latex:pt) \
locale(gedit-latex:pt_BR) \
locale(gedit-latex:ro) \
locale(gedit-latex:ru) \
locale(gedit-latex:sl) \
locale(gedit-latex:sr) \
locale(gedit-latex:sr@latin) \
locale(gedit-latex:sv) \
locale(gedit-latex:th) \
locale(gedit-latex:zh_CN) \
locale(gedit-latex:zh_TW)"
RDEPENDS:${PN} += "gedit-latex"

inherit rpm
