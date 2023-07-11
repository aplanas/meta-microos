SUMMARY = "Translations for package skrooge"
DESCRIPTION = "Provides translations for the 'skrooge' package."
LICENSE = "GPL-3.0-only"

PV = "2.28.0"

RPM_NAME = "skrooge-lang-2.28.0-1.12.noarch.rpm"
RPM_HASH = "ad1ade0e6f74a1982a15a3ebddf163a0465efedb4bb7909a4256060813f83d011be0f91b371703abae98f768335bdf8e255cc28cbfd18a6ec1e26d5ffbb257d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-skrooge-ar \
locale-skrooge-bg \
locale-skrooge-bs \
locale-skrooge-ca \
locale-skrooge-ca@valencia \
locale-skrooge-cs \
locale-skrooge-da \
locale-skrooge-de \
locale-skrooge-el \
locale-skrooge-en-GB \
locale-skrooge-eo \
locale-skrooge-es \
locale-skrooge-et \
locale-skrooge-fi \
locale-skrooge-fr \
locale-skrooge-ga \
locale-skrooge-gl \
locale-skrooge-hu \
locale-skrooge-ia \
locale-skrooge-it \
locale-skrooge-ko \
locale-skrooge-lt \
locale-skrooge-mr \
locale-skrooge-ms \
locale-skrooge-nb \
locale-skrooge-nds \
locale-skrooge-nl \
locale-skrooge-pl \
locale-skrooge-pt \
locale-skrooge-pt-BR \
locale-skrooge-ro \
locale-skrooge-ru \
locale-skrooge-sk \
locale-skrooge-sl \
locale-skrooge-sv \
locale-skrooge-tr \
locale-skrooge-ug \
locale-skrooge-uk \
locale-skrooge-zh-CN \
locale-skrooge-zh-TW \
skrooge-lang \
skrooge-lang-all"

RDEPENDS:${PN} += "skrooge"

inherit rpm
