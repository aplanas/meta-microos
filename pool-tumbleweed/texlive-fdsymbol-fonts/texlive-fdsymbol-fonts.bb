SUMMARY = "Severed fonts for texlive-fdsymbol"
DESCRIPTION = "The  separated fonts package for texlive-fdsymbol"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.8svn61719"

RPM_NAME = "texlive-fdsymbol-fonts-2023.209.0.0.8svn61719-53.1.noarch.rpm"
RPM_HASH = "ffdf2ed063123c5a44981702fe3933597aee46765377549ed0d7bf67d37651d4408468206b8e549813b12476686013fd53dd19d92539edd7269c553d80cc25b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-fdsymbol-fonts \
font-fdsymbol \
font-fdsymbola \
font-fdsymbolb \
font-fdsymbolc \
font-fdsymbold \
font-fdsymbole \
font-fdsymbolf \
texlive-fdsymbol-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
