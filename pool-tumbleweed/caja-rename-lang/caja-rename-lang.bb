SUMMARY = "Translations for package caja-rename"
DESCRIPTION = "Provides translations for the 'caja-rename' package."
LICENSE = "GPL-3.0-or-later"

PV = "22.10.31"

RPM_NAME = "caja-rename-lang-22.10.31-1.2.noarch.rpm"
RPM_HASH = "76912fce3b2fb2c47bb812f7436835e1918fd7c31348118ff21a75ed55673d0afb21d1bf999778049065c54abaef67eec3d1e988c16d45e845ddf687d70eeb6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-rename-lang \
caja-rename-lang-all \
locale-caja-rename-ar \
locale-caja-rename-ca \
locale-caja-rename-cs \
locale-caja-rename-de \
locale-caja-rename-el \
locale-caja-rename-en-GB \
locale-caja-rename-es \
locale-caja-rename-fr \
locale-caja-rename-hr \
locale-caja-rename-lt \
locale-caja-rename-nb-NO \
locale-caja-rename-nl \
locale-caja-rename-oc \
locale-caja-rename-pt-BR \
locale-caja-rename-sl \
locale-caja-rename-zh-Hans"

RDEPENDS:${PN} += "caja-rename"

inherit rpm
