SUMMARY = "Severed fonts for texlive-svrsymbols"
DESCRIPTION = "The  separated fonts package for texlive-svrsymbols"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn50019"

RPM_NAME = "texlive-svrsymbols-fonts-2023.201.2.0bsvn50019-57.1.noarch.rpm"
RPM_HASH = "e87ffa2ba5bfe6deae67e1c7334959576c0f502881f0200d7cbad6f6f67c06ad78577f6c930e32d2804068d96bdc2a7623475b60c66175395f6c6b27fc213b87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-svrsymbols-fonts) \
font(svrsymbols) \
texlive-svrsymbols-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
