SUMMARY = "Translations for package gimp-save-for-web"
DESCRIPTION = "Provides translations for the 'gimp-save-for-web' package."
LICENSE = "GPL-2.0+"

PV = "0.29.3"

RPM_NAME = "gimp-save-for-web-lang-0.29.3-13.31.noarch.rpm"
RPM_HASH = "e93ca403ff40c75c2fdec2ec1afdc03b99f1f57a52e0c038dae12b963b5cd44bff3079bd1a5892d413d0ead3a5025e31a00826fb5cd873e241531da7d85b9803"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-save-for-web-lang \
gimp-save-for-web-lang-all \
locale-gimp-save-for-web-ca \
locale-gimp-save-for-web-es \
locale-gimp-save-for-web-fr \
locale-gimp-save-for-web-it \
locale-gimp-save-for-web-ja \
locale-gimp-save-for-web-ko \
locale-gimp-save-for-web-pt-BR \
locale-gimp-save-for-web-ru \
locale-gimp-save-for-web-sk \
locale-gimp-save-for-web-sv"

RDEPENDS:${PN} += "gimp-save-for-web"

inherit rpm
