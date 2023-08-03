SUMMARY = "Font for graphical symbols used in crystallography"
DESCRIPTION = "The font is provided as an Adobe Type 1 font, and as Metafont \
source. Instructions for use are available both in the README \
file and (with a font diagram) in the documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-cryst-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "aa3661f1d330a536a8fc5082b3083ac0c40eec80af5b7972de526f73fff0b64356affaad0c96865a3e4eebcc442de9baf06f47de4bae3bbed1c3c3b0bc1e2a6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cryst.tfm \
texlive-cryst"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-cryst-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
