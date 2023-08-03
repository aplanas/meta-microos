SUMMARY = "Support for fancy frames"
DESCRIPTION = "The package defines means of drawing frames around boxes, using \
dingbat fonts. Some (Metafont) font sources are included; the \
fonts are available separately in Type 1 format."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1csvn36086"

RPM_NAME = "texlive-niceframe-2023.209.1.1csvn36086-55.1.noarch.rpm"
RPM_HASH = "bf0c764718979a29f6133164677c3b21fc386839b87212069a136a5475a5b20531ca6451e226cb1b2a7a690cc14043b95bb8315c6704a3d37668b2c3f75c0bf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-karta15.tfm \
tex-niceframe.sty \
tex-umranda.tfm \
tex-umrandb.tfm \
texlive-niceframe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
