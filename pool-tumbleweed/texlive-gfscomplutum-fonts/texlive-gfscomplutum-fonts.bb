SUMMARY = "Severed fonts for texlive-gfscomplutum"
DESCRIPTION = "The  separated fonts package for texlive-gfscomplutum"
LICENSE = "OFL-1.1"

PV = "2023.201.1.0svn19469"

RPM_NAME = "texlive-gfscomplutum-fonts-2023.201.1.0svn19469-52.1.noarch.rpm"
RPM_HASH = "e4f7bab1ef978b1c4e3593869b28d66c553a8e69debaac7581be57591a5439710fc4af2cfb6adae5df2d535c010c54ee0ff9f7c0245594ad5a692538eb89c14c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-gfscomplutum-fonts \
font--lang=el \
font-gfscomplutum \
texlive-gfscomplutum-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
