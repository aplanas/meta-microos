SUMMARY = "Translations for package tilda"
DESCRIPTION = "Provides translations for the 'tilda' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.4"

RPM_NAME = "tilda-lang-1.5.4-1.12.noarch.rpm"
RPM_HASH = "6cf267b87347f6810812b3ddec25a8e6bbb6f849366aec837b2395e0c2f1d60199ddfe13df7f9e6c7ba7ba3d9f43bcdd43840578ec8ae7f7f27c890c3919ae44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tilda-bg \
locale-tilda-ca \
locale-tilda-cs \
locale-tilda-de \
locale-tilda-el \
locale-tilda-en-GB \
locale-tilda-es \
locale-tilda-fr \
locale-tilda-hu \
locale-tilda-it \
locale-tilda-lt \
locale-tilda-nb \
locale-tilda-pl \
locale-tilda-pt \
locale-tilda-pt-BR \
locale-tilda-ru \
locale-tilda-sk \
locale-tilda-sl \
locale-tilda-sv \
locale-tilda-tr \
locale-tilda-zh-CN \
locale-tilda-zh-TW \
tilda-lang \
tilda-lang-all"

RDEPENDS:${PN} += "tilda"

inherit rpm
