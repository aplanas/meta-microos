SUMMARY = "Translations for package dpkg"
DESCRIPTION = "Provides translations for the 'dpkg' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.21.22"

RPM_NAME = "dpkg-lang-1.21.22-1.1.noarch.rpm"
RPM_HASH = "b29b3ccc6f7acf9ede26104920e3406f9eef908db9b3bd5c89f1bf143e2d845f62b7c730b25774ea9c67f9a55f9fdbfdfc839f8de43403631426817c0c03ad68"
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
