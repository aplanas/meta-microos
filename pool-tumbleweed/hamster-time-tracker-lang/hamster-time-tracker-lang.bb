SUMMARY = "Translations for package hamster-time-tracker"
DESCRIPTION = "Provides translations for the 'hamster-time-tracker' package."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "3.0.3~20"

RPM_NAME = "hamster-time-tracker-lang-3.0.3~20-8.1.noarch.rpm"
RPM_HASH = "b31806549ccfff5922857d734382f387c8f6a47a443af90f2c24f6ad8e5083ece8295389e30518762f3d4c2c08b54ef8eb4d96f02900245fd5295b956e74efa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hamster-time-tracker-lang \
hamster-time-tracker-lang-all \
locale-hamster-time-tracker-af \
locale-hamster-time-tracker-ar \
locale-hamster-time-tracker-as \
locale-hamster-time-tracker-be \
locale-hamster-time-tracker-bg \
locale-hamster-time-tracker-bn \
locale-hamster-time-tracker-bn-IN \
locale-hamster-time-tracker-ca \
locale-hamster-time-tracker-ca@valencia \
locale-hamster-time-tracker-cs \
locale-hamster-time-tracker-da \
locale-hamster-time-tracker-de \
locale-hamster-time-tracker-el \
locale-hamster-time-tracker-en-CA \
locale-hamster-time-tracker-en-GB \
locale-hamster-time-tracker-en@shaw \
locale-hamster-time-tracker-eo \
locale-hamster-time-tracker-es \
locale-hamster-time-tracker-et \
locale-hamster-time-tracker-eu \
locale-hamster-time-tracker-fi \
locale-hamster-time-tracker-fr \
locale-hamster-time-tracker-gl \
locale-hamster-time-tracker-gu \
locale-hamster-time-tracker-he \
locale-hamster-time-tracker-hi \
locale-hamster-time-tracker-hr \
locale-hamster-time-tracker-hu \
locale-hamster-time-tracker-id \
locale-hamster-time-tracker-it \
locale-hamster-time-tracker-ja \
locale-hamster-time-tracker-kn \
locale-hamster-time-tracker-ko \
locale-hamster-time-tracker-lt \
locale-hamster-time-tracker-lv \
locale-hamster-time-tracker-mai \
locale-hamster-time-tracker-mk \
locale-hamster-time-tracker-ml \
locale-hamster-time-tracker-mr \
locale-hamster-time-tracker-nb \
locale-hamster-time-tracker-nl \
locale-hamster-time-tracker-or \
locale-hamster-time-tracker-pa \
locale-hamster-time-tracker-pl \
locale-hamster-time-tracker-pt \
locale-hamster-time-tracker-pt-BR \
locale-hamster-time-tracker-ro \
locale-hamster-time-tracker-ru \
locale-hamster-time-tracker-si \
locale-hamster-time-tracker-sl \
locale-hamster-time-tracker-sq \
locale-hamster-time-tracker-sr \
locale-hamster-time-tracker-sr@latin \
locale-hamster-time-tracker-sv \
locale-hamster-time-tracker-ta \
locale-hamster-time-tracker-te \
locale-hamster-time-tracker-th \
locale-hamster-time-tracker-tr \
locale-hamster-time-tracker-ug \
locale-hamster-time-tracker-uk \
locale-hamster-time-tracker-vi \
locale-hamster-time-tracker-zh-CN \
locale-hamster-time-tracker-zh-HK \
locale-hamster-time-tracker-zh-TW"

RDEPENDS:${PN} += "hamster-time-tracker"

inherit rpm
