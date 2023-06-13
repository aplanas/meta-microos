SUMMARY = "Documentation for the International Fonts"
DESCRIPTION = "This package contains the READMEs for international fonts from the \
following packages: \
 \
intlfonts-arabic-bitmap-fonts: Arab fonts for X11 \
 \
intlfonts-asian-bitmap-fonts: Asian fonts for X11 \
 \
intlfonts-chinese-bitmap-fonts: Chinese fonts for X11 \
 \
intlfonts-chinese-big-bitmap-fonts: Big Chinese fonts for X11 \
 \
intlfonts-ethiopic-bitmap-fonts: Ethiopic fonts for X11 \
 \
intlfonts-euro-bitmap-fonts: European fonts for X11 \
 \
intlfonts-japanese-bitmap-fonts: Japanese fonts for X11 \
 \
intlfonts-japanese-big-bitmap-fonts: Big Japanese fonts for X11 \
 \
intlfonts-phonetic-bitmap-fonts: IPA fonts for X11 \
 \
intlfonts-ttf-fonts: TrueType fonts \
 \
intlfonts-type1-fonts: Type1 fonts \
 \
intlfonts-bdf-fonts: Bitmap fonts useful for printing exotic languages from \
Emacs"
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "intlfonts-1.2.1-16.15.noarch.rpm"
RPM_HASH = "6e47605269b83e9d9f462c34054519339badc269eeea8da02e55d8a2463f9f56cae1cbefc87e1c9266c8e28bfc9677e3d4841e6e9b5c6453464685777659f74b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intlfnts \
intlfonts"

RDEPENDS:${PN} += "aaa_base \
coreutils \
perl"

inherit rpm
