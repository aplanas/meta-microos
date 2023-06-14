SUMMARY = "Translations for package caribou"
DESCRIPTION = "Provides translations for the 'caribou' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-lang-0.4.21-8.7.noarch.rpm"
RPM_HASH = "8354864951c0c7562230df688753b0a947e5cfd6b48f897768d2c8addd566f58633f3c06de6f80a10d496af89ed6e803f0a92c0a49cb06472acb40c2941a5e71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caribou-lang \
caribou-lang-all \
locale-caribou-ar \
locale-caribou-as \
locale-caribou-ast \
locale-caribou-be \
locale-caribou-bg \
locale-caribou-bn-IN \
locale-caribou-bs \
locale-caribou-ca \
locale-caribou-ca@valencia \
locale-caribou-cs \
locale-caribou-da \
locale-caribou-de \
locale-caribou-el \
locale-caribou-en-GB \
locale-caribou-eo \
locale-caribou-es \
locale-caribou-et \
locale-caribou-eu \
locale-caribou-fa \
locale-caribou-fi \
locale-caribou-fr \
locale-caribou-fur \
locale-caribou-gl \
locale-caribou-gu \
locale-caribou-he \
locale-caribou-hi \
locale-caribou-hu \
locale-caribou-id \
locale-caribou-it \
locale-caribou-ja \
locale-caribou-kk \
locale-caribou-km \
locale-caribou-kn \
locale-caribou-ko \
locale-caribou-lt \
locale-caribou-lv \
locale-caribou-mk \
locale-caribou-ml \
locale-caribou-mr \
locale-caribou-ms \
locale-caribou-nb \
locale-caribou-ne \
locale-caribou-nl \
locale-caribou-nn \
locale-caribou-oc \
locale-caribou-or \
locale-caribou-pa \
locale-caribou-pl \
locale-caribou-pt \
locale-caribou-pt-BR \
locale-caribou-ro \
locale-caribou-ru \
locale-caribou-si \
locale-caribou-sk \
locale-caribou-sl \
locale-caribou-sr \
locale-caribou-sr@latin \
locale-caribou-sv \
locale-caribou-ta \
locale-caribou-te \
locale-caribou-tr \
locale-caribou-ug \
locale-caribou-uk \
locale-caribou-vi \
locale-caribou-zh-CN \
locale-caribou-zh-HK \
locale-caribou-zh-TW"

RDEPENDS:${PN} += "caribou"

inherit rpm
