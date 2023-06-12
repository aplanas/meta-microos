SUMMARY = "Translations for package uget"
DESCRIPTION = "Provides translations for the 'uget' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.3"

RPM_NAME = "uget-lang-2.2.3-3.14.noarch.rpm"
RPM_HASH = "2e4b81ccccf3d9389e2d867b4459a86e063d114c733a8694eff5ba1cdca878070529ef898bfab0722c448385ce11022d725cdc80fed58be16d15af8d39e4e1b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(uget:ar) \
locale(uget:be) \
locale(uget:bg) \
locale(uget:ca) \
locale(uget:cs) \
locale(uget:da) \
locale(uget:de) \
locale(uget:es) \
locale(uget:fa) \
locale(uget:fr) \
locale(uget:he) \
locale(uget:hr) \
locale(uget:hu) \
locale(uget:id) \
locale(uget:it) \
locale(uget:ja) \
locale(uget:kk) \
locale(uget:lt) \
locale(uget:pl) \
locale(uget:pt_BR) \
locale(uget:ro) \
locale(uget:ru) \
locale(uget:sr) \
locale(uget:sr@latin) \
locale(uget:sv) \
locale(uget:tr) \
locale(uget:uk) \
locale(uget:vi) \
locale(uget:zh_CN) \
locale(uget:zh_TW) \
uget-lang \
uget-lang-all"
RDEPENDS:${PN} += "uget"

inherit rpm
