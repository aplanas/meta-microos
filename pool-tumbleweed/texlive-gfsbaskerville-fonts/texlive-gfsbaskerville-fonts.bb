SUMMARY = "Severed fonts for texlive-gfsbaskerville"
DESCRIPTION = "The  separated fonts package for texlive-gfsbaskerville"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn19440"

RPM_NAME = "texlive-gfsbaskerville-fonts-2023.201.1.0svn19440-52.1.noarch.rpm"
RPM_HASH = "1cef4ce6caef224de50399d09b685a5b66dd58404f55457422825203b589e05e056b18279f1c0001185e4422dff2f4d00c166e82e3ec5ebf52c8177f7ae04a61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-gfsbaskerville-fonts) \
font(:lang=el) \
font(gfsbaskerville) \
texlive-gfsbaskerville-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
