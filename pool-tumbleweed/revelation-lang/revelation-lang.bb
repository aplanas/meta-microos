SUMMARY = "Translations for package revelation"
DESCRIPTION = "Provides translations for the 'revelation' package."
LICENSE = "GPL-2.0-only"

PV = "0.5.4"

RPM_NAME = "revelation-lang-0.5.4-2.7.noarch.rpm"
RPM_HASH = "421c5d52ae94bc0174727523f89a00c058635a6a993ee987a6dede6bebc1e55372e9a6fabe66b03345895129a24692a01fe77d399acba2625d086c5a5f12b903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-revelation-ca \
locale-revelation-cs \
locale-revelation-de \
locale-revelation-es \
locale-revelation-et \
locale-revelation-eu \
locale-revelation-fi \
locale-revelation-fr \
locale-revelation-it-IT \
locale-revelation-lt \
locale-revelation-nl \
locale-revelation-pl \
locale-revelation-pt-BR \
locale-revelation-ru \
locale-revelation-sv \
locale-revelation-uk \
locale-revelation-zh \
revelation-lang \
revelation-lang-all"

RDEPENDS:${PN} += "revelation"

inherit rpm
