SUMMARY = "Translations for package plank"
DESCRIPTION = "Provides translations for the 'plank' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.11.89"

RPM_NAME = "plank-lang-0.11.89-2.5.noarch.rpm"
RPM_HASH = "79afdf0f93c60c10e5b485221d74e0407651220f42a154133fc8dd0290833bfcbcc7840c9a5f9c1438a36f2caa95378e89213434854cb83fe5fe865f071d7a0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plank-ar \
locale-plank-bg \
locale-plank-bs \
locale-plank-ca \
locale-plank-cs \
locale-plank-da \
locale-plank-de \
locale-plank-el \
locale-plank-en-AU \
locale-plank-en-CA \
locale-plank-en-GB \
locale-plank-eo \
locale-plank-es \
locale-plank-et \
locale-plank-eu \
locale-plank-fi \
locale-plank-fr \
locale-plank-ga \
locale-plank-gd \
locale-plank-gl \
locale-plank-he \
locale-plank-hr \
locale-plank-hu \
locale-plank-id \
locale-plank-it \
locale-plank-ja \
locale-plank-ka \
locale-plank-ko \
locale-plank-lt \
locale-plank-lv \
locale-plank-ml \
locale-plank-ms \
locale-plank-nb \
locale-plank-ne \
locale-plank-nl \
locale-plank-nn \
locale-plank-pl \
locale-plank-pt \
locale-plank-pt-BR \
locale-plank-ro \
locale-plank-ru \
locale-plank-sk \
locale-plank-sl \
locale-plank-sq \
locale-plank-sr \
locale-plank-sr@latin \
locale-plank-sv \
locale-plank-ta \
locale-plank-te \
locale-plank-th \
locale-plank-tr \
locale-plank-uk \
locale-plank-vi \
locale-plank-zh-CN \
locale-plank-zh-TW \
plank-lang \
plank-lang-all"

RDEPENDS:${PN} += "plank"

inherit rpm
