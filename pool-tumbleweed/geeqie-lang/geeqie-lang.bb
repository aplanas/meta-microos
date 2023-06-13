SUMMARY = "Translations for package geeqie"
DESCRIPTION = "Provides translations for the 'geeqie' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "geeqie-lang-2.0.1-2.1.noarch.rpm"
RPM_HASH = "1ab82a894dcc24101c19b8aaf1652182aaddd51a0f2bf63f3d46e7c97b93667bf6dc35cc55f179ef145caf0d44594ebf43476bcaf0a4a35108403d7810747a14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geeqie-lang \
geeqie-lang-all \
locale(geeqie:ar) \
locale(geeqie:be) \
locale(geeqie:bg) \
locale(geeqie:ca) \
locale(geeqie:cs) \
locale(geeqie:da) \
locale(geeqie:de) \
locale(geeqie:el) \
locale(geeqie:en_GB) \
locale(geeqie:eo) \
locale(geeqie:es) \
locale(geeqie:et) \
locale(geeqie:eu) \
locale(geeqie:fi) \
locale(geeqie:fr) \
locale(geeqie:hu) \
locale(geeqie:id) \
locale(geeqie:it) \
locale(geeqie:ja) \
locale(geeqie:ko) \
locale(geeqie:nb) \
locale(geeqie:nl) \
locale(geeqie:pl) \
locale(geeqie:pt_BR) \
locale(geeqie:ro) \
locale(geeqie:ru) \
locale(geeqie:sk) \
locale(geeqie:sl) \
locale(geeqie:sr) \
locale(geeqie:sr@latin) \
locale(geeqie:sv) \
locale(geeqie:th) \
locale(geeqie:tr) \
locale(geeqie:uk) \
locale(geeqie:vi) \
locale(geeqie:zh_CN) \
locale(geeqie:zh_TW)"

RDEPENDS:${PN} += "geeqie"

inherit rpm
