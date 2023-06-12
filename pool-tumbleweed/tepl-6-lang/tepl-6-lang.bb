SUMMARY = "Translations for package tepl-6"
DESCRIPTION = "Provides translations for the 'tepl-6' package."
LICENSE = "LGPL-3.0-or-later"

PV = "6.4.0"

RPM_NAME = "tepl-6-lang-6.4.0-1.5.noarch.rpm"
RPM_HASH = "a90f2c9f3bdf2430af02927e95d5c5e6a098e7c07d9f518e0918d63aaae678b3e7bc71ce8a73ad47539507e21dff3931a521fa912559d5af7618f28c12a97190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(tepl-6:ca) \
locale(tepl-6:cs) \
locale(tepl-6:da) \
locale(tepl-6:de) \
locale(tepl-6:el) \
locale(tepl-6:en_GB) \
locale(tepl-6:es) \
locale(tepl-6:eu) \
locale(tepl-6:fr) \
locale(tepl-6:fur) \
locale(tepl-6:hr) \
locale(tepl-6:hu) \
locale(tepl-6:id) \
locale(tepl-6:ja) \
locale(tepl-6:nl) \
locale(tepl-6:pl) \
locale(tepl-6:pt_BR) \
locale(tepl-6:ro) \
locale(tepl-6:ru) \
locale(tepl-6:sl) \
locale(tepl-6:sr) \
locale(tepl-6:sv) \
locale(tepl-6:tr) \
locale(tepl-6:uk) \
locale(tepl-6:zh_CN) \
tepl-6-lang \
tepl-6-lang-all"
RDEPENDS:${PN} += "tepl-6"

inherit rpm
