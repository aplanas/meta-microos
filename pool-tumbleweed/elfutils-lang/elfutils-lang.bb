SUMMARY = "Translations for package elfutils"
DESCRIPTION = "Provides translations for the 'elfutils' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "elfutils-lang-0.189-4.1.noarch.rpm"
RPM_HASH = "760b7c3f82b3501bb8d92a86e54f87052f5e09f3dbf777aa7d82172d3519b6c352fe75ec79628925148a4e6372d3f0cb8bb54cf2a677bb44b72123362482f526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elfutils-lang \
elfutils-lang-all \
locale-elfutils-de \
locale-elfutils-en@boldquot \
locale-elfutils-en@quot \
locale-elfutils-es \
locale-elfutils-ja \
locale-elfutils-pl \
locale-elfutils-uk"

RDEPENDS:${PN} += "elfutils"

inherit rpm
