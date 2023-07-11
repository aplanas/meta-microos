SUMMARY = "Translations for package akonadiconsole"
DESCRIPTION = "Provides translations for the 'akonadiconsole' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadiconsole-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "9ec89a24ccc3930542d72e2be390a4d542f1150e153684a2f0e273ae791a471733f75fa857457934ec9023ab5aa100f66f220d4d318a1bdfbbf528e30a466e55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akonadiconsole-lang \
akonadiconsole-lang-all \
locale-akonadiconsole-ca \
locale-akonadiconsole-ca@valencia \
locale-akonadiconsole-cs \
locale-akonadiconsole-de \
locale-akonadiconsole-en-GB \
locale-akonadiconsole-es \
locale-akonadiconsole-eu \
locale-akonadiconsole-fi \
locale-akonadiconsole-fr \
locale-akonadiconsole-ia \
locale-akonadiconsole-it \
locale-akonadiconsole-ka \
locale-akonadiconsole-ko \
locale-akonadiconsole-lt \
locale-akonadiconsole-nl \
locale-akonadiconsole-pl \
locale-akonadiconsole-pt \
locale-akonadiconsole-ru \
locale-akonadiconsole-sk \
locale-akonadiconsole-sl \
locale-akonadiconsole-tr \
locale-akonadiconsole-uk \
locale-akonadiconsole-zh-CN"

RDEPENDS:${PN} += "akonadiconsole"

inherit rpm
