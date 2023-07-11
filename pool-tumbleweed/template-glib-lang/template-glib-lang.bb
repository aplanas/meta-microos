SUMMARY = "Translations for package template-glib"
DESCRIPTION = "Provides translations for the 'template-glib' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.1"

RPM_NAME = "template-glib-lang-3.36.1-1.4.noarch.rpm"
RPM_HASH = "29c230c4043d18538c5699209393c271d6c2e8b1e57d6d1e7c39f45e3293eb52a604ce06f8af192175d289f9073426dec8e83da0184e9d9dd1dbec0bf298c74d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-template-glib-ca \
locale-template-glib-cs \
locale-template-glib-da \
locale-template-glib-de \
locale-template-glib-el \
locale-template-glib-en-GB \
locale-template-glib-es \
locale-template-glib-eu \
locale-template-glib-fr \
locale-template-glib-fur \
locale-template-glib-hr \
locale-template-glib-hu \
locale-template-glib-id \
locale-template-glib-it \
locale-template-glib-ka \
locale-template-glib-lt \
locale-template-glib-nl \
locale-template-glib-pl \
locale-template-glib-pt \
locale-template-glib-pt-BR \
locale-template-glib-ro \
locale-template-glib-sl \
locale-template-glib-sr \
locale-template-glib-sv \
locale-template-glib-tr \
locale-template-glib-uk \
locale-template-glib-zh-CN \
template-glib-lang \
template-glib-lang-all"

RDEPENDS:${PN} += "template-glib"

inherit rpm
