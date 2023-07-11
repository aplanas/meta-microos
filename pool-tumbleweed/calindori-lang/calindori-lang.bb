SUMMARY = "Translations for package calindori"
DESCRIPTION = "Provides translations for the 'calindori' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "calindori-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "846a267e2b43831e2718881f71ef410bc3c7369afcfc3f364f85c043c55cb98aa115caa8a8b058b29b4dc63d53bdeba6afd3efef0ee1a908288377d817461fb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calindori-lang \
calindori-lang-all \
locale-calindori-ca \
locale-calindori-ca@valencia \
locale-calindori-cs \
locale-calindori-da \
locale-calindori-de \
locale-calindori-el \
locale-calindori-en-GB \
locale-calindori-es \
locale-calindori-et \
locale-calindori-eu \
locale-calindori-fi \
locale-calindori-fr \
locale-calindori-gl \
locale-calindori-ia \
locale-calindori-it \
locale-calindori-ja \
locale-calindori-ka \
locale-calindori-ko \
locale-calindori-lt \
locale-calindori-nl \
locale-calindori-nn \
locale-calindori-pa \
locale-calindori-pl \
locale-calindori-pt \
locale-calindori-pt-BR \
locale-calindori-ru \
locale-calindori-sk \
locale-calindori-sl \
locale-calindori-sv \
locale-calindori-tr \
locale-calindori-uk \
locale-calindori-zh-CN \
locale-calindori-zh-TW"

RDEPENDS:${PN} += "calindori"

inherit rpm
