SUMMARY = "Translations for package pspp"
DESCRIPTION = "Provides translations for the 'pspp' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.2"

RPM_NAME = "pspp-lang-1.6.2-1.1.noarch.rpm"
RPM_HASH = "87be69845f55d39999bde7c21e684592a5e7ca2b2e2cb853bb3d42361a30543cf3a60f9d2d39e5138d266eb55f98fd0e71392cbef505dbf75feb80d91e9c32d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pspp-ca \
locale-pspp-cs \
locale-pspp-de \
locale-pspp-el \
locale-pspp-es \
locale-pspp-fr \
locale-pspp-gl \
locale-pspp-hu \
locale-pspp-ja \
locale-pspp-lt \
locale-pspp-nl \
locale-pspp-pl \
locale-pspp-pt-BR \
locale-pspp-ru \
locale-pspp-sl \
locale-pspp-tr \
locale-pspp-uk \
locale-pspp-zh-CN \
pspp-lang \
pspp-lang-all"

RDEPENDS:${PN} += "pspp"

inherit rpm
