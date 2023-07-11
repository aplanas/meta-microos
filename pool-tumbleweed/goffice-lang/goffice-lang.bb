SUMMARY = "Translations for package goffice"
DESCRIPTION = "Provides translations for the 'goffice' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.10.55"

RPM_NAME = "goffice-lang-0.10.55-1.4.noarch.rpm"
RPM_HASH = "30cd0faec9cbe973d98d74742859ae2392107c9d6589bf3cfbb84166c96210899cfb8ea10cc2d17abdbb455855a81ed72a3e0370814c3d820d85bd341c1dc1ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goffice-lang \
goffice-lang-all \
locale-goffice-ar \
locale-goffice-ast \
locale-goffice-az \
locale-goffice-bg \
locale-goffice-bs \
locale-goffice-ca \
locale-goffice-ca@valencia \
locale-goffice-cs \
locale-goffice-da \
locale-goffice-de \
locale-goffice-el \
locale-goffice-en-CA \
locale-goffice-en-GB \
locale-goffice-eo \
locale-goffice-es \
locale-goffice-et \
locale-goffice-eu \
locale-goffice-fi \
locale-goffice-fr \
locale-goffice-fur \
locale-goffice-ga \
locale-goffice-gl \
locale-goffice-he \
locale-goffice-hr \
locale-goffice-hu \
locale-goffice-id \
locale-goffice-it \
locale-goffice-ja \
locale-goffice-ko \
locale-goffice-lt \
locale-goffice-lv \
locale-goffice-ml \
locale-goffice-mr \
locale-goffice-ms \
locale-goffice-nb \
locale-goffice-nl \
locale-goffice-nn \
locale-goffice-oc \
locale-goffice-pl \
locale-goffice-pt \
locale-goffice-pt-BR \
locale-goffice-ro \
locale-goffice-ru \
locale-goffice-sk \
locale-goffice-sl \
locale-goffice-sr \
locale-goffice-sr@latin \
locale-goffice-sv \
locale-goffice-ta \
locale-goffice-tr \
locale-goffice-uk \
locale-goffice-vi \
locale-goffice-zh-CN \
locale-goffice-zh-HK \
locale-goffice-zh-TW"

RDEPENDS:${PN} += "goffice"

inherit rpm
