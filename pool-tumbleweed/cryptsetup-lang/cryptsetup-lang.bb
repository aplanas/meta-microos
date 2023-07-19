SUMMARY = "Translations for package cryptsetup"
DESCRIPTION = "Provides translations for the 'cryptsetup' package.(cryptsetup)"
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "cryptsetup-lang-2.6.1-3.1.noarch.rpm"
RPM_HASH = "1bc04e437dbd47bc37a3ddcb68daadc0df33b9ed31bdeaaaff8ce5a8221cd0915acf06607086faba74e0dc0f473cf2f9cbcb09e4a0e9d84fbaa07856fe80089f"
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
