SUMMARY = "Severed fonts for texlive-mdsymbol"
DESCRIPTION = "The  separated fonts package for texlive-mdsymbol"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.5svn28399"

RPM_NAME = "texlive-mdsymbol-fonts-2023.201.0.0.5svn28399-52.1.noarch.rpm"
RPM_HASH = "64f372785238269ddf4ffbce7d54735e5c5137afa866a255411c6329452895771dba408576fff9573af24f573e654328c7e5d9177bc6f1d32477c000c94eaae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-mdsymbol-fonts \
font-mdsymbol \
font-mdsymbola \
font-mdsymbolb \
font-mdsymbolc \
font-mdsymbold \
font-mdsymbole \
font-mdsymbolf \
texlive-mdsymbol-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
