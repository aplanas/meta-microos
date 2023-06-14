SUMMARY = "Translations for package gnumeric"
DESCRIPTION = "Provides translations for the 'gnumeric' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.12.55"

RPM_NAME = "gnumeric-lang-1.12.55-1.3.noarch.rpm"
RPM_HASH = "29bd06b425bb2fac6e9f23fdad3b6903cf79e7ec66638b12403c70887208d05d124727902060cc3a0c035102a41106aa21401f7d6d26202599a47b2b3011608b"
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
