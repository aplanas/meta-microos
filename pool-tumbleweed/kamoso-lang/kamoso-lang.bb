SUMMARY = "Translations for package kamoso"
DESCRIPTION = "Provides translations for the 'kamoso' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kamoso-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "cb206f18a1b6be04c91637f13f913526a20c222b219539e2767d3c8f8175b89749ab1322147aa296443169bd9b0b72c8347cb8d61f9b875623b8df8f18e46c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kamoso-lang \
kamoso-lang-all \
locale-kamoso-ar \
locale-kamoso-bg \
locale-kamoso-bs \
locale-kamoso-ca \
locale-kamoso-ca@valencia \
locale-kamoso-cs \
locale-kamoso-da \
locale-kamoso-de \
locale-kamoso-el \
locale-kamoso-en-GB \
locale-kamoso-eo \
locale-kamoso-es \
locale-kamoso-et \
locale-kamoso-eu \
locale-kamoso-fi \
locale-kamoso-fr \
locale-kamoso-ga \
locale-kamoso-gl \
locale-kamoso-hu \
locale-kamoso-ia \
locale-kamoso-id \
locale-kamoso-is \
locale-kamoso-it \
locale-kamoso-ja \
locale-kamoso-ka \
locale-kamoso-kk \
locale-kamoso-ko \
locale-kamoso-lt \
locale-kamoso-lv \
locale-kamoso-mai \
locale-kamoso-mr \
locale-kamoso-nb \
locale-kamoso-nds \
locale-kamoso-nl \
locale-kamoso-nn \
locale-kamoso-pa \
locale-kamoso-pl \
locale-kamoso-pt \
locale-kamoso-pt-BR \
locale-kamoso-ro \
locale-kamoso-ru \
locale-kamoso-sk \
locale-kamoso-sl \
locale-kamoso-sv \
locale-kamoso-tr \
locale-kamoso-ug \
locale-kamoso-uk \
locale-kamoso-zh-CN \
locale-kamoso-zh-TW"

RDEPENDS:${PN} += "kamoso"

inherit rpm
