SUMMARY = "Translations for package gpaste"
DESCRIPTION = "Provides translations for the 'gpaste' package."
LICENSE = "BSD-2-Clause"

PV = "44.1"

RPM_NAME = "gpaste-lang-44.1-1.1.noarch.rpm"
RPM_HASH = "d264a28df2d52dee4590f7f7a581e1885d14e61816e0f681e5eccd87f04aca0510c84573f714328c7aaf4eefc4f1cb067f804491465ff8c9a10034179f8cd403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpaste-lang \
gpaste-lang-all \
locale-gpaste-ar \
locale-gpaste-cs \
locale-gpaste-da \
locale-gpaste-de \
locale-gpaste-es \
locale-gpaste-fa \
locale-gpaste-fr \
locale-gpaste-gl \
locale-gpaste-it \
locale-gpaste-ja \
locale-gpaste-ka \
locale-gpaste-ko \
locale-gpaste-nb-NO \
locale-gpaste-oc \
locale-gpaste-pl \
locale-gpaste-pt-BR \
locale-gpaste-ru \
locale-gpaste-sl \
locale-gpaste-sv \
locale-gpaste-tr \
locale-gpaste-vi \
locale-gpaste-zh-CN \
locale-gpaste-zh-Hant"

RDEPENDS:${PN} += "gpaste"

inherit rpm
