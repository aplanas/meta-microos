SUMMARY = "Translations for package plasma-browser-integration"
DESCRIPTION = "Provides translations for the 'plasma-browser-integration' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.27.6"

RPM_NAME = "plasma-browser-integration-lang-5.27.6-1.1.noarch.rpm"
RPM_HASH = "138278c70323c2fd97ed594d52f7909f3fb3f428074d7973e675377407fafa47f2233331b456caa1b9033aa4063bf9ab61e1c2e8b1efab088756f4ef595b8cef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma-browser-integration-ar \
locale-plasma-browser-integration-az \
locale-plasma-browser-integration-bg \
locale-plasma-browser-integration-ca \
locale-plasma-browser-integration-ca@valencia \
locale-plasma-browser-integration-cs \
locale-plasma-browser-integration-da \
locale-plasma-browser-integration-de \
locale-plasma-browser-integration-el \
locale-plasma-browser-integration-en-GB \
locale-plasma-browser-integration-es \
locale-plasma-browser-integration-et \
locale-plasma-browser-integration-eu \
locale-plasma-browser-integration-fi \
locale-plasma-browser-integration-fr \
locale-plasma-browser-integration-gl \
locale-plasma-browser-integration-hu \
locale-plasma-browser-integration-ia \
locale-plasma-browser-integration-id \
locale-plasma-browser-integration-it \
locale-plasma-browser-integration-ja \
locale-plasma-browser-integration-ka \
locale-plasma-browser-integration-ko \
locale-plasma-browser-integration-lt \
locale-plasma-browser-integration-ml \
locale-plasma-browser-integration-nl \
locale-plasma-browser-integration-nn \
locale-plasma-browser-integration-pa \
locale-plasma-browser-integration-pl \
locale-plasma-browser-integration-pt \
locale-plasma-browser-integration-pt-BR \
locale-plasma-browser-integration-ro \
locale-plasma-browser-integration-ru \
locale-plasma-browser-integration-sk \
locale-plasma-browser-integration-sl \
locale-plasma-browser-integration-sv \
locale-plasma-browser-integration-ta \
locale-plasma-browser-integration-tr \
locale-plasma-browser-integration-uk \
locale-plasma-browser-integration-zh-CN \
locale-plasma-browser-integration-zh-TW \
plasma-browser-integration-lang \
plasma-browser-integration-lang-all"

RDEPENDS:${PN} += "plasma-browser-integration"

inherit rpm
