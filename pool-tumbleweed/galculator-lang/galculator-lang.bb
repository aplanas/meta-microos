SUMMARY = "Translations for package galculator"
DESCRIPTION = "Provides translations for the 'galculator' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.4"

RPM_NAME = "galculator-lang-2.1.4-3.15.noarch.rpm"
RPM_HASH = "6a0dd72658f0a02c957b545a1414e82cd3774237bab4449e87455941ff1fe5a8013938e0569931b846362bc29659ac6ebbc92a1e953ed8e5f4202ddc97d4a74a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "galculator-lang \
galculator-lang-all \
locale-galculator-cs \
locale-galculator-de \
locale-galculator-el \
locale-galculator-en-AU \
locale-galculator-es \
locale-galculator-es-MX \
locale-galculator-fr \
locale-galculator-gl \
locale-galculator-hu \
locale-galculator-id \
locale-galculator-it \
locale-galculator-ja \
locale-galculator-kk \
locale-galculator-lt \
locale-galculator-mr \
locale-galculator-pl \
locale-galculator-pt \
locale-galculator-pt-BR \
locale-galculator-ro \
locale-galculator-ru \
locale-galculator-sk \
locale-galculator-sv \
locale-galculator-tr \
locale-galculator-uk \
locale-galculator-zh-CN \
locale-galculator-zh-TW"

RDEPENDS:${PN} += "galculator"

inherit rpm
