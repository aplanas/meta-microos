SUMMARY = "Translations for package accerciser"
DESCRIPTION = "Provides translations for the 'accerciser' package."
LICENSE = "BSD-3-Clause"

PV = "3.40.0"

RPM_NAME = "accerciser-lang-3.40.0-1.4.noarch.rpm"
RPM_HASH = "42b21b2915b91c0844f700ba6c20a39ff628c110ddb2584f2b4c4bc692bca2da38f33338ef376dd0a971f8ebb72e0820c32657a105025327786f40a79110cdfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "accerciser-lang \
accerciser-lang-all \
locale-accerciser-ar \
locale-accerciser-as \
locale-accerciser-ast \
locale-accerciser-be \
locale-accerciser-bg \
locale-accerciser-bn \
locale-accerciser-bn-IN \
locale-accerciser-br \
locale-accerciser-bs \
locale-accerciser-ca \
locale-accerciser-ca@valencia \
locale-accerciser-cs \
locale-accerciser-da \
locale-accerciser-de \
locale-accerciser-dz \
locale-accerciser-el \
locale-accerciser-en-CA \
locale-accerciser-en-GB \
locale-accerciser-en@shaw \
locale-accerciser-eo \
locale-accerciser-es \
locale-accerciser-et \
locale-accerciser-eu \
locale-accerciser-fi \
locale-accerciser-fr \
locale-accerciser-fur \
locale-accerciser-gl \
locale-accerciser-gu \
locale-accerciser-he \
locale-accerciser-hi \
locale-accerciser-hu \
locale-accerciser-id \
locale-accerciser-it \
locale-accerciser-ja \
locale-accerciser-kk \
locale-accerciser-km \
locale-accerciser-kn \
locale-accerciser-ko \
locale-accerciser-lt \
locale-accerciser-lv \
locale-accerciser-mai \
locale-accerciser-mk \
locale-accerciser-ml \
locale-accerciser-mr \
locale-accerciser-ms \
locale-accerciser-nb \
locale-accerciser-ne \
locale-accerciser-nl \
locale-accerciser-oc \
locale-accerciser-or \
locale-accerciser-pa \
locale-accerciser-pl \
locale-accerciser-pt \
locale-accerciser-pt-BR \
locale-accerciser-ro \
locale-accerciser-ru \
locale-accerciser-si \
locale-accerciser-sk \
locale-accerciser-sl \
locale-accerciser-sq \
locale-accerciser-sr \
locale-accerciser-sr@latin \
locale-accerciser-sv \
locale-accerciser-te \
locale-accerciser-th \
locale-accerciser-tr \
locale-accerciser-ug \
locale-accerciser-uk \
locale-accerciser-vi \
locale-accerciser-zh-CN \
locale-accerciser-zh-HK \
locale-accerciser-zh-TW"

RDEPENDS:${PN} += "accerciser"

inherit rpm
