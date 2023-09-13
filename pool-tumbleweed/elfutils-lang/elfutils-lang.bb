SUMMARY = "Translations for package elfutils"
DESCRIPTION = "Provides translations for the 'elfutils' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "elfutils-lang-0.189-5.1.noarch.rpm"
RPM_HASH = "64dcdf4e6cf4e70478e77f23959daa767396efc94ef7d6876ff79c4879b9bd4d85a1dc37e6739359d2a47ceab6a075449cbc609cef4a192d308b4cf010b2e8a1"
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
