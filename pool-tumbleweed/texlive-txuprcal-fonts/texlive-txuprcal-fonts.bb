SUMMARY = "Severed fonts for texlive-txuprcal"
DESCRIPTION = "The  separated fonts package for texlive-txuprcal"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.00svn43327"

RPM_NAME = "texlive-txuprcal-fonts-2023.209.1.00svn43327-53.1.noarch.rpm"
RPM_HASH = "271c6fcfac12dc155ae8322d6e23d807b1b2e96542f31ca9e1ef921af26965c57f32b4f190019efd1bcc850c63f5c41468ffdb4750b849f2935fa07daa4b26b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-txuprcal \
texlive-txuprcal-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
