SUMMARY = "Translations for package kjournald"
DESCRIPTION = "Provides translations for the 'kjournald' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kjournald-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "b0c2c71a9908e74bf6cdee2c71b43e669a0501256cbeef08a5234fb1f8b5f0b8cf1bb51ce3985ddc7479faebb3f93298e159dac5093ba01b7ebd0ff2dc080dd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kjournald-lang \
kjournald-lang-all \
locale-kjournald-ca \
locale-kjournald-ca@valencia \
locale-kjournald-cs \
locale-kjournald-de \
locale-kjournald-en-GB \
locale-kjournald-es \
locale-kjournald-eu \
locale-kjournald-fi \
locale-kjournald-fr \
locale-kjournald-gl \
locale-kjournald-it \
locale-kjournald-ja \
locale-kjournald-ka \
locale-kjournald-ko \
locale-kjournald-lt \
locale-kjournald-nl \
locale-kjournald-pl \
locale-kjournald-pt \
locale-kjournald-ru \
locale-kjournald-sk \
locale-kjournald-sl \
locale-kjournald-sv \
locale-kjournald-tr \
locale-kjournald-uk \
locale-kjournald-zh-CN \
locale-kjournald-zh-TW"

RDEPENDS:${PN} += "kjournald"

inherit rpm
