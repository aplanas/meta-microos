SUMMARY = "Translations for package gummi"
DESCRIPTION = "Provides translations for the 'gummi' package."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "gummi-lang-0.8.3-1.7.noarch.rpm"
RPM_HASH = "f45037675e5d640053a6d96b56489f40788f72532b56e83d50bc6da67ba2cbe7cc585fb143d439251b6d7331dd107e3168eea0bb9164ff551110d2e3bf4227e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gummi-lang \
gummi-lang-all \
locale-gummi-ar \
locale-gummi-ca \
locale-gummi-cs \
locale-gummi-da \
locale-gummi-de \
locale-gummi-el \
locale-gummi-es \
locale-gummi-fr \
locale-gummi-hu \
locale-gummi-it \
locale-gummi-nl \
locale-gummi-pl \
locale-gummi-pt \
locale-gummi-pt-BR \
locale-gummi-ro \
locale-gummi-ru \
locale-gummi-sv \
locale-gummi-zh-CN \
locale-gummi-zh-TW"

RDEPENDS:${PN} += "gummi"

inherit rpm
