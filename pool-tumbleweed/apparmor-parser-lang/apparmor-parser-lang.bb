SUMMARY = "Translations for package apparmor-parser"
DESCRIPTION = "Provides translations for the 'apparmor-parser' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-parser-lang-3.1.6-1.1.noarch.rpm"
RPM_HASH = "a65f3cf32c32e4f0b7d2e0076a1c78679d50beb475baa87ec09d72094167ed1d7a05952138be9b33b7afb5fcdcc87634ddb1d0cf7992f8aee4f7e0eea31890a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-parser-lang \
apparmor-parser-lang-all \
locale-apparmor-parser-af \
locale-apparmor-parser-ar \
locale-apparmor-parser-bg \
locale-apparmor-parser-bn \
locale-apparmor-parser-bs \
locale-apparmor-parser-ca \
locale-apparmor-parser-cs \
locale-apparmor-parser-cy \
locale-apparmor-parser-da \
locale-apparmor-parser-de \
locale-apparmor-parser-el \
locale-apparmor-parser-en-AU \
locale-apparmor-parser-en-CA \
locale-apparmor-parser-en-GB \
locale-apparmor-parser-es \
locale-apparmor-parser-et \
locale-apparmor-parser-fa \
locale-apparmor-parser-fi \
locale-apparmor-parser-fr \
locale-apparmor-parser-gl \
locale-apparmor-parser-gu \
locale-apparmor-parser-he \
locale-apparmor-parser-hi \
locale-apparmor-parser-hr \
locale-apparmor-parser-hu \
locale-apparmor-parser-id \
locale-apparmor-parser-it \
locale-apparmor-parser-ja \
locale-apparmor-parser-ka \
locale-apparmor-parser-km \
locale-apparmor-parser-ko \
locale-apparmor-parser-lt \
locale-apparmor-parser-mk \
locale-apparmor-parser-mr \
locale-apparmor-parser-ms \
locale-apparmor-parser-nb \
locale-apparmor-parser-nl \
locale-apparmor-parser-oc \
locale-apparmor-parser-pa \
locale-apparmor-parser-pl \
locale-apparmor-parser-pt \
locale-apparmor-parser-pt-BR \
locale-apparmor-parser-ro \
locale-apparmor-parser-ru \
locale-apparmor-parser-si \
locale-apparmor-parser-sk \
locale-apparmor-parser-sl \
locale-apparmor-parser-sq \
locale-apparmor-parser-sr \
locale-apparmor-parser-sv \
locale-apparmor-parser-ta \
locale-apparmor-parser-th \
locale-apparmor-parser-tr \
locale-apparmor-parser-ug \
locale-apparmor-parser-uk \
locale-apparmor-parser-vi \
locale-apparmor-parser-wa \
locale-apparmor-parser-zh-CN \
locale-apparmor-parser-zh-TW"

RDEPENDS:${PN} += "apparmor-parser"

inherit rpm
