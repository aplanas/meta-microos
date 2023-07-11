SUMMARY = "Translations for package cryptsetup"
DESCRIPTION = "Provides translations for the 'cryptsetup' package.(cryptsetup)"
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "cryptsetup-lang-2.6.1-2.1.noarch.rpm"
RPM_HASH = "c4de83ecfb118756e393589fc414478913e5f9f44a1f986b8e83705e1bc520c95b51310061ad7a4190ac53631084ee827aa303869a369cc8678fded8fa064def"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cryptsetup-lang \
cryptsetup-lang-all \
locale-cryptsetup-cs \
locale-cryptsetup-da \
locale-cryptsetup-de \
locale-cryptsetup-es \
locale-cryptsetup-fi \
locale-cryptsetup-fr \
locale-cryptsetup-id \
locale-cryptsetup-it \
locale-cryptsetup-ja \
locale-cryptsetup-ka \
locale-cryptsetup-nl \
locale-cryptsetup-pl \
locale-cryptsetup-pt-BR \
locale-cryptsetup-ro \
locale-cryptsetup-ru \
locale-cryptsetup-sr \
locale-cryptsetup-sv \
locale-cryptsetup-uk \
locale-cryptsetup-vi \
locale-cryptsetup-zh-CN"

RDEPENDS:${PN} += "cryptsetup"

inherit rpm
