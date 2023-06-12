SUMMARY = "Translations for package minicom"
DESCRIPTION = "Provides translations for the 'minicom' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8"

RPM_NAME = "minicom-lang-2.8-1.5.noarch.rpm"
RPM_HASH = "14d6c20f4ec0f410a30ba0e4534152f99e9f81e2f2224c07cbff9bed91d22941a307af06b61a1d2a82d307fafc951485bbd9b8a3e4b10052873018ed858a0ee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(minicom:cs) \
locale(minicom:da) \
locale(minicom:de) \
locale(minicom:es) \
locale(minicom:fi) \
locale(minicom:fr) \
locale(minicom:hu) \
locale(minicom:id) \
locale(minicom:ja) \
locale(minicom:nb) \
locale(minicom:pl) \
locale(minicom:pt_BR) \
locale(minicom:ro) \
locale(minicom:ru) \
locale(minicom:sr) \
locale(minicom:sv) \
locale(minicom:vi) \
locale(minicom:zh_CN) \
locale(minicom:zh_TW) \
minicom-lang \
minicom-lang-all"
RDEPENDS:${PN} += "minicom"

inherit rpm
