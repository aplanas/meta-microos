SUMMARY = "Locale Data for the GNU Compiler Collection"
DESCRIPTION = "Locale data for the GNU Compiler Collection (GCC) to give error message \
in the current locale."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "gcc13-locale-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "2df269f154590383e3a3ae720998fb8e092a1581c67f5211766f22b19fbc28745616a1f19cc01e1b5f82bcc9c5704fb2c73206c6abc03eddde3b83b3a0d08bf5"

RPROVIDES:${PN} += "gcc13-locale \
locale-gcc13-be \
locale-gcc13-ca \
locale-gcc13-da \
locale-gcc13-de \
locale-gcc13-el \
locale-gcc13-eo \
locale-gcc13-es \
locale-gcc13-fi \
locale-gcc13-fr \
locale-gcc13-hr \
locale-gcc13-id \
locale-gcc13-ja \
locale-gcc13-ka \
locale-gcc13-nl \
locale-gcc13-pt-BR \
locale-gcc13-ro \
locale-gcc13-ru \
locale-gcc13-sr \
locale-gcc13-sv \
locale-gcc13-tr \
locale-gcc13-uk \
locale-gcc13-vi \
locale-gcc13-zh-CN \
locale-gcc13-zh-TW"

RDEPENDS:${PN} += "gcc13"

inherit rpm
