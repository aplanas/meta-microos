SUMMARY = "Translations for package kio_perldoc"
DESCRIPTION = "Provides translations for the 'kio_perldoc' package."
LICENSE = "GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "kio_perldoc-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "84bdfdf6099fe611f8b42ed727c0e3aafb46c698abf749acff7f65c07aa95b7e126edb40afe60d7ae601784cc8f630bcc4d4c0819b531b391bb2cd42c58127c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio-perldoc-lang \
kio-perldoc-lang-all \
locale-kio-perldoc-bs \
locale-kio-perldoc-ca \
locale-kio-perldoc-ca@valencia \
locale-kio-perldoc-cs \
locale-kio-perldoc-da \
locale-kio-perldoc-de \
locale-kio-perldoc-el \
locale-kio-perldoc-en-GB \
locale-kio-perldoc-eo \
locale-kio-perldoc-es \
locale-kio-perldoc-et \
locale-kio-perldoc-eu \
locale-kio-perldoc-fi \
locale-kio-perldoc-fr \
locale-kio-perldoc-ga \
locale-kio-perldoc-gl \
locale-kio-perldoc-hi \
locale-kio-perldoc-hu \
locale-kio-perldoc-it \
locale-kio-perldoc-ja \
locale-kio-perldoc-ka \
locale-kio-perldoc-kk \
locale-kio-perldoc-ko \
locale-kio-perldoc-lt \
locale-kio-perldoc-mr \
locale-kio-perldoc-nb \
locale-kio-perldoc-nds \
locale-kio-perldoc-nl \
locale-kio-perldoc-nn \
locale-kio-perldoc-pa \
locale-kio-perldoc-pl \
locale-kio-perldoc-pt \
locale-kio-perldoc-pt-BR \
locale-kio-perldoc-ru \
locale-kio-perldoc-sk \
locale-kio-perldoc-sl \
locale-kio-perldoc-sq \
locale-kio-perldoc-sv \
locale-kio-perldoc-tr \
locale-kio-perldoc-ug \
locale-kio-perldoc-uk \
locale-kio-perldoc-zh-CN \
locale-kio-perldoc-zh-TW"

RDEPENDS:${PN} += "kio-perldoc"

inherit rpm
