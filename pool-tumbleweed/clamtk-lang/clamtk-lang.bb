SUMMARY = "Translations for package clamtk"
DESCRIPTION = "Provides translations for the 'clamtk' package."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.16"

RPM_NAME = "clamtk-lang-6.16-1.2.noarch.rpm"
RPM_HASH = "848f5d3a21b01278e5bc6cf7438cb5e0130df856d36f309b02bfba0b00320b2922d7ec31053c97c847a66b092b56f23acc01ae59653af105348061e4a5ce5db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clamtk-lang \
clamtk-lang-all \
locale-clamtk-af \
locale-clamtk-ar \
locale-clamtk-az \
locale-clamtk-bg \
locale-clamtk-bs \
locale-clamtk-ca \
locale-clamtk-cs \
locale-clamtk-da \
locale-clamtk-de \
locale-clamtk-el \
locale-clamtk-en-AU \
locale-clamtk-en-CA \
locale-clamtk-en-GB \
locale-clamtk-eo \
locale-clamtk-es \
locale-clamtk-eu \
locale-clamtk-fi \
locale-clamtk-fr \
locale-clamtk-ga \
locale-clamtk-gl \
locale-clamtk-he \
locale-clamtk-hr \
locale-clamtk-hu \
locale-clamtk-id \
locale-clamtk-it \
locale-clamtk-ja \
locale-clamtk-kk \
locale-clamtk-km \
locale-clamtk-ko \
locale-clamtk-lt \
locale-clamtk-lv \
locale-clamtk-mr \
locale-clamtk-ms \
locale-clamtk-nb \
locale-clamtk-nl \
locale-clamtk-nn \
locale-clamtk-pa \
locale-clamtk-pl \
locale-clamtk-pt \
locale-clamtk-pt-BR \
locale-clamtk-ro \
locale-clamtk-ru \
locale-clamtk-si \
locale-clamtk-sk \
locale-clamtk-sl \
locale-clamtk-sr@latin \
locale-clamtk-sv \
locale-clamtk-ta \
locale-clamtk-te \
locale-clamtk-th \
locale-clamtk-tr \
locale-clamtk-ug \
locale-clamtk-uk \
locale-clamtk-zh-CN \
locale-clamtk-zh-TW"

RDEPENDS:${PN} += "clamtk"

inherit rpm
