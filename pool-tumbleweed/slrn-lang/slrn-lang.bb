SUMMARY = "Translations for package slrn"
DESCRIPTION = "Provides translations for the 'slrn' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "slrn-lang-1.0.3-3.19.noarch.rpm"
RPM_HASH = "8287924fea43ba6f55770817f12a2f4cf63ea43c0280fdcc6d94dfdafe139a53e603d734167a54dfc8399b58d39c4f40dc028f469996d00b25de903256b99127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-slrn-be \
locale-slrn-da \
locale-slrn-de \
locale-slrn-es \
locale-slrn-fi \
locale-slrn-fr \
locale-slrn-it \
locale-slrn-ko \
locale-slrn-nl \
locale-slrn-pl \
locale-slrn-ru \
locale-slrn-sv \
locale-slrn-tr \
slrn-lang \
slrn-lang-all"

RDEPENDS:${PN} += "slrn"

inherit rpm
