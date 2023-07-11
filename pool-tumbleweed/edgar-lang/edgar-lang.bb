SUMMARY = "Translations for package edgar"
DESCRIPTION = "Provides translations for the 'edgar' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.36"

RPM_NAME = "edgar-lang-1.36-1.4.noarch.rpm"
RPM_HASH = "c191f84f527acfba18f048a1f73885b2fdad9a99519808be3a9d8f595f81881eeff174d4da60380bd081e54171c9a0ab49a4ef3391621cbea11e90fb900ca509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "edgar-lang \
edgar-lang-all \
locale-edgar-ar \
locale-edgar-cs \
locale-edgar-da \
locale-edgar-de \
locale-edgar-el \
locale-edgar-en-GB \
locale-edgar-en-US \
locale-edgar-eo \
locale-edgar-es \
locale-edgar-fa \
locale-edgar-fr \
locale-edgar-hi \
locale-edgar-id \
locale-edgar-it \
locale-edgar-ja \
locale-edgar-ko \
locale-edgar-lv \
locale-edgar-ms \
locale-edgar-nl \
locale-edgar-pl \
locale-edgar-pt \
locale-edgar-pt-BR \
locale-edgar-ro \
locale-edgar-ru \
locale-edgar-sk \
locale-edgar-sr \
locale-edgar-sv \
locale-edgar-ta \
locale-edgar-tr \
locale-edgar-uk \
locale-edgar-vi \
locale-edgar-zh-CN"

RDEPENDS:${PN} += "edgar"

inherit rpm
