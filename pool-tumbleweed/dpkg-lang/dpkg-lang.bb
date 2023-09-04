SUMMARY = "Translations for package dpkg"
DESCRIPTION = "Provides translations for the 'dpkg' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.21.22"

RPM_NAME = "dpkg-lang-1.21.22-1.2.noarch.rpm"
RPM_HASH = "56362965073226561fe92c7f6e7d1e96db1126d1a314f80058b413d62e4eff1f709a95c20123faa3776a1e9ebfb6d5e431db9fd8251972b42c89f74e087594fb"
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
