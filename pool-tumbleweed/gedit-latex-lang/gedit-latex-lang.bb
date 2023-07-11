SUMMARY = "Translations for package gedit-latex"
DESCRIPTION = "Provides translations for the 'gedit-latex' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.20.0"

RPM_NAME = "gedit-latex-lang-3.20.0-4.17.noarch.rpm"
RPM_HASH = "ac33183a6ccb0c96745c97e6fd450a2a7815b71d864b9de891880196ce72d164d42782e59bc968d33c18039750843df156f524f077db304a787b6cf197aa44c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gedit-latex-lang \
gedit-latex-lang-all \
locale-gedit-latex-bs \
locale-gedit-latex-ca \
locale-gedit-latex-cs \
locale-gedit-latex-da \
locale-gedit-latex-de \
locale-gedit-latex-el \
locale-gedit-latex-eo \
locale-gedit-latex-es \
locale-gedit-latex-eu \
locale-gedit-latex-fr \
locale-gedit-latex-gl \
locale-gedit-latex-hu \
locale-gedit-latex-id \
locale-gedit-latex-it \
locale-gedit-latex-ko \
locale-gedit-latex-lv \
locale-gedit-latex-nb \
locale-gedit-latex-oc \
locale-gedit-latex-pl \
locale-gedit-latex-pt \
locale-gedit-latex-pt-BR \
locale-gedit-latex-ro \
locale-gedit-latex-ru \
locale-gedit-latex-sl \
locale-gedit-latex-sr \
locale-gedit-latex-sr@latin \
locale-gedit-latex-sv \
locale-gedit-latex-th \
locale-gedit-latex-zh-CN \
locale-gedit-latex-zh-TW"

RDEPENDS:${PN} += "gedit-latex"

inherit rpm
