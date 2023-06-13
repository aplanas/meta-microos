SUMMARY = "Severed fonts for texlive-fdsymbol"
DESCRIPTION = "The  separated fonts package for texlive-fdsymbol"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.8svn61719"

RPM_NAME = "texlive-fdsymbol-fonts-2023.201.0.0.8svn61719-52.1.noarch.rpm"
RPM_HASH = "d31a2056a1a3fe4fe875078d353f61739aa7fea8dc96f7aab81ba86c450d25b0f0d6e787fff3d4a494579216568cd38a2032b5686b239006dc1ef553b7b129f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-fdsymbol-fonts) \
font(fdsymbol) \
font(fdsymbola) \
font(fdsymbolb) \
font(fdsymbolc) \
font(fdsymbold) \
font(fdsymbole) \
font(fdsymbolf) \
texlive-fdsymbol-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
