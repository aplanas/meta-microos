SUMMARY = "Translations for package gnumeric"
DESCRIPTION = "Provides translations for the 'gnumeric' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.12.55"

RPM_NAME = "gnumeric-lang-1.12.55-1.4.noarch.rpm"
RPM_HASH = "a35d98d3839f569d6cd4b1381b8dd093e3966e18d49da2e39db65a0ca078938d001d771ae933d141f057fb1b5c0d1ec5c5e7dd458d11809d746f30b1a0a11c73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnumeric-lang \
gnumeric-lang-all \
locale-gnumeric-ar \
locale-gnumeric-ast \
locale-gnumeric-az \
locale-gnumeric-bg \
locale-gnumeric-bs \
locale-gnumeric-ca \
locale-gnumeric-ca@valencia \
locale-gnumeric-cs \
locale-gnumeric-da \
locale-gnumeric-de \
locale-gnumeric-dz \
locale-gnumeric-el \
locale-gnumeric-en-CA \
locale-gnumeric-en-GB \
locale-gnumeric-eo \
locale-gnumeric-es \
locale-gnumeric-et \
locale-gnumeric-eu \
locale-gnumeric-fi \
locale-gnumeric-fr \
locale-gnumeric-ga \
locale-gnumeric-gl \
locale-gnumeric-gu \
locale-gnumeric-he \
locale-gnumeric-hr \
locale-gnumeric-hu \
locale-gnumeric-id \
locale-gnumeric-it \
locale-gnumeric-ja \
locale-gnumeric-kk \
locale-gnumeric-ko \
locale-gnumeric-lt \
locale-gnumeric-lv \
locale-gnumeric-mk \
locale-gnumeric-ml \
locale-gnumeric-mr \
locale-gnumeric-ms \
locale-gnumeric-nb \
locale-gnumeric-ne \
locale-gnumeric-nl \
locale-gnumeric-nn \
locale-gnumeric-oc \
locale-gnumeric-pl \
locale-gnumeric-pt \
locale-gnumeric-pt-BR \
locale-gnumeric-ro \
locale-gnumeric-ru \
locale-gnumeric-sk \
locale-gnumeric-sl \
locale-gnumeric-sr \
locale-gnumeric-sr@latin \
locale-gnumeric-sv \
locale-gnumeric-te \
locale-gnumeric-tr \
locale-gnumeric-uk \
locale-gnumeric-vi \
locale-gnumeric-zh-CN \
locale-gnumeric-zh-HK \
locale-gnumeric-zh-TW"

RDEPENDS:${PN} += "gnumeric"

inherit rpm
