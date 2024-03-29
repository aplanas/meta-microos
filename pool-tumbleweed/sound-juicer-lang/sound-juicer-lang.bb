SUMMARY = "Translations for package sound-juicer"
DESCRIPTION = "Provides translations for the 'sound-juicer' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "sound-juicer-lang-3.40.0-1.1.noarch.rpm"
RPM_HASH = "de04e1c5855721c2834831512c50b6169c856a62382a5987cd5018e38d63371c5c070ed354806307b91f540be99e7bde02ae415d1673922e339ce4073a57dc8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-sound-juicer-ar \
locale-sound-juicer-as \
locale-sound-juicer-ast \
locale-sound-juicer-az \
locale-sound-juicer-be \
locale-sound-juicer-be@latin \
locale-sound-juicer-bg \
locale-sound-juicer-bn \
locale-sound-juicer-bn-IN \
locale-sound-juicer-br \
locale-sound-juicer-bs \
locale-sound-juicer-ca \
locale-sound-juicer-ca@valencia \
locale-sound-juicer-cs \
locale-sound-juicer-cy \
locale-sound-juicer-da \
locale-sound-juicer-de \
locale-sound-juicer-dz \
locale-sound-juicer-el \
locale-sound-juicer-en-CA \
locale-sound-juicer-en-GB \
locale-sound-juicer-en@shaw \
locale-sound-juicer-eo \
locale-sound-juicer-es \
locale-sound-juicer-et \
locale-sound-juicer-eu \
locale-sound-juicer-fa \
locale-sound-juicer-fi \
locale-sound-juicer-fr \
locale-sound-juicer-fur \
locale-sound-juicer-ga \
locale-sound-juicer-gl \
locale-sound-juicer-gu \
locale-sound-juicer-he \
locale-sound-juicer-hi \
locale-sound-juicer-hr \
locale-sound-juicer-hu \
locale-sound-juicer-id \
locale-sound-juicer-it \
locale-sound-juicer-ja \
locale-sound-juicer-ka \
locale-sound-juicer-kn \
locale-sound-juicer-ko \
locale-sound-juicer-lt \
locale-sound-juicer-lv \
locale-sound-juicer-mai \
locale-sound-juicer-mk \
locale-sound-juicer-ml \
locale-sound-juicer-mr \
locale-sound-juicer-ms \
locale-sound-juicer-nb \
locale-sound-juicer-ne \
locale-sound-juicer-nl \
locale-sound-juicer-nn \
locale-sound-juicer-oc \
locale-sound-juicer-or \
locale-sound-juicer-pa \
locale-sound-juicer-pl \
locale-sound-juicer-pt \
locale-sound-juicer-pt-BR \
locale-sound-juicer-ro \
locale-sound-juicer-ru \
locale-sound-juicer-si \
locale-sound-juicer-sk \
locale-sound-juicer-sl \
locale-sound-juicer-sq \
locale-sound-juicer-sr \
locale-sound-juicer-sr@latin \
locale-sound-juicer-sv \
locale-sound-juicer-ta \
locale-sound-juicer-te \
locale-sound-juicer-th \
locale-sound-juicer-tr \
locale-sound-juicer-ug \
locale-sound-juicer-uk \
locale-sound-juicer-vi \
locale-sound-juicer-zh-CN \
locale-sound-juicer-zh-HK \
locale-sound-juicer-zh-TW \
sound-juicer-lang \
sound-juicer-lang-all"

RDEPENDS:${PN} += "sound-juicer"

inherit rpm
