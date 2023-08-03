SUMMARY = "Alphanumerical LCD-style displays"
DESCRIPTION = "A LaTeX package that will display text as on an (early) LCD \
display (the output is very visibly pixellated). Assumes 8-bit \
input in its internal verbatim-style environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn16549"

RPM_NAME = "texlive-lcd-2023.209.0.0.3svn16549-55.1.noarch.rpm"
RPM_HASH = "6a381ab52e6c7ecfc72ca624272c0591acdcafafc67e43ed70e9ae53d31c561b0c06388f0d0cdc40a24856a301d277adcf92d5d6f21e968a9b1d52aafa3822e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lcd.sty \
texlive-lcd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
