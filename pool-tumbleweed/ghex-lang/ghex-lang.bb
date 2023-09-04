SUMMARY = "Translations for package ghex"
DESCRIPTION = "Provides translations for the 'ghex' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "ghex-lang-44.2-1.1.noarch.rpm"
RPM_HASH = "2ef8196437fa9db27c3b3f312345ebc0a08263b2cfa6c288334389c68ad744820563095dbad3ec39f895816c05ba5011cb81947dfaad99fcf8e0bcf38c216917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghex-lang \
ghex-lang-all \
locale-ghex-ar \
locale-ghex-az \
locale-ghex-be \
locale-ghex-bg \
locale-ghex-bs \
locale-ghex-ca \
locale-ghex-cs \
locale-ghex-da \
locale-ghex-de \
locale-ghex-dz \
locale-ghex-el \
locale-ghex-en-CA \
locale-ghex-en-GB \
locale-ghex-es \
locale-ghex-et \
locale-ghex-eu \
locale-ghex-fa \
locale-ghex-fi \
locale-ghex-fr \
locale-ghex-fur \
locale-ghex-ga \
locale-ghex-gl \
locale-ghex-he \
locale-ghex-hr \
locale-ghex-hu \
locale-ghex-id \
locale-ghex-it \
locale-ghex-ja \
locale-ghex-ko \
locale-ghex-lt \
locale-ghex-lv \
locale-ghex-mk \
locale-ghex-ml \
locale-ghex-ms \
locale-ghex-nb \
locale-ghex-ne \
locale-ghex-nl \
locale-ghex-nn \
locale-ghex-oc \
locale-ghex-pa \
locale-ghex-pl \
locale-ghex-pt \
locale-ghex-pt-BR \
locale-ghex-ro \
locale-ghex-ru \
locale-ghex-sk \
locale-ghex-sl \
locale-ghex-sq \
locale-ghex-sr \
locale-ghex-sr@latin \
locale-ghex-sv \
locale-ghex-th \
locale-ghex-tr \
locale-ghex-uk \
locale-ghex-vi \
locale-ghex-wa \
locale-ghex-zh-CN \
locale-ghex-zh-TW"

RDEPENDS:${PN} += "ghex"

inherit rpm
