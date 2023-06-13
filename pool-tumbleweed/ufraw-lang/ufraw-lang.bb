SUMMARY = "Translations for package ufraw"
DESCRIPTION = "Provides translations for the 'ufraw' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.22"

RPM_NAME = "ufraw-lang-0.22-11.8.noarch.rpm"
RPM_HASH = "eb91069e0fd6b976eed8197ecad14273f3ab266313a414cd56da15e30a99dd8721a40d25dc0c6c57cb08688f78ac9f2dd7b3fc1be62f8e45d35689d513969254"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(ufraw:ca) \
locale(ufraw:cs) \
locale(ufraw:da) \
locale(ufraw:de) \
locale(ufraw:es) \
locale(ufraw:fr) \
locale(ufraw:it) \
locale(ufraw:ja) \
locale(ufraw:ko) \
locale(ufraw:nb) \
locale(ufraw:nl) \
locale(ufraw:pl) \
locale(ufraw:pt) \
locale(ufraw:ru) \
locale(ufraw:sr) \
locale(ufraw:sr@latin) \
locale(ufraw:sv) \
locale(ufraw:zh_CN) \
locale(ufraw:zh_TW) \
ufraw-lang \
ufraw-lang-all"

RDEPENDS:${PN} += "ufraw"

inherit rpm
