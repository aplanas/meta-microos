SUMMARY = "Translations for package dpkg"
DESCRIPTION = "Provides translations for the 'dpkg' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.21.8"

RPM_NAME = "dpkg-lang-1.21.8-2.2.noarch.rpm"
RPM_HASH = "f056da94976704c3edc180a970cc76446153dffd02c283a90762456949ad1fac27d4d1a9ebb9abfd7e56fb6214ec9402499c721dfa426d010931f2b7c206301e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpkg-lang \
dpkg-lang-all \
locale-dpkg-ast \
locale-dpkg-bs \
locale-dpkg-ca \
locale-dpkg-cs \
locale-dpkg-da \
locale-dpkg-de \
locale-dpkg-dz \
locale-dpkg-el \
locale-dpkg-eo \
locale-dpkg-es \
locale-dpkg-et \
locale-dpkg-eu \
locale-dpkg-fr \
locale-dpkg-gl \
locale-dpkg-hu \
locale-dpkg-id \
locale-dpkg-it \
locale-dpkg-ja \
locale-dpkg-km \
locale-dpkg-ko \
locale-dpkg-lt \
locale-dpkg-mr \
locale-dpkg-nb \
locale-dpkg-ne \
locale-dpkg-nl \
locale-dpkg-nn \
locale-dpkg-oc \
locale-dpkg-pa \
locale-dpkg-pl \
locale-dpkg-pt \
locale-dpkg-pt-BR \
locale-dpkg-ro \
locale-dpkg-ru \
locale-dpkg-sk \
locale-dpkg-sv \
locale-dpkg-th \
locale-dpkg-tr \
locale-dpkg-vi \
locale-dpkg-zh-CN \
locale-dpkg-zh-TW"

RDEPENDS:${PN} += "dpkg"

inherit rpm
