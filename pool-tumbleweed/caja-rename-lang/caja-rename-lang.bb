SUMMARY = "Translations for package caja-rename"
DESCRIPTION = "Provides translations for the 'caja-rename' package."
LICENSE = "GPL-3.0-or-later"

PV = "22.10.31"

RPM_NAME = "caja-rename-lang-22.10.31-1.3.noarch.rpm"
RPM_HASH = "b6555e09385696955208c6c346637b8ef599e7a0d7d4dd6b0897940cc78c39e1d4ed75a8d23bdbd242f41038d46496baf14c7271da089f2c5bc780bbb1a9f957"
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
