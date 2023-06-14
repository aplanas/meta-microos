SUMMARY = "Translations for package remake"
DESCRIPTION = "Provides translations for the 'remake' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.3_1.5"

RPM_NAME = "remake-lang-4.3_1.5-1.10.noarch.rpm"
RPM_HASH = "f848bda5fa0bf96695e5340b6f430f5b82627ef36ec2c2cbf34d655ffddfa6d8240bc28f619fb77d0cc0f587b81c603f8709a58b7a79158f482f4c3fdd6901af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-remake-be \
locale-remake-bg \
locale-remake-cs \
locale-remake-da \
locale-remake-de \
locale-remake-es \
locale-remake-fi \
locale-remake-fr \
locale-remake-ga \
locale-remake-gl \
locale-remake-he \
locale-remake-hr \
locale-remake-id \
locale-remake-it \
locale-remake-ja \
locale-remake-ko \
locale-remake-lt \
locale-remake-nl \
locale-remake-pl \
locale-remake-pt \
locale-remake-pt-BR \
locale-remake-ru \
locale-remake-sr \
locale-remake-sv \
locale-remake-tr \
locale-remake-uk \
locale-remake-vi \
locale-remake-zh-CN \
locale-remake-zh-TW \
remake-lang \
remake-lang-all"

RDEPENDS:${PN} += "remake"

inherit rpm
