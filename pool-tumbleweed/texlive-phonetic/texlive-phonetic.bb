SUMMARY = "Metafont Phonetic fonts, based on Computer Modern"
DESCRIPTION = "The fonts are based on Computer Modern, and specified in \
Metafont. Macros for the fonts' use are provided, both for \
LaTeX 2.09 and for current LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn56468"

RPM_NAME = "texlive-phonetic-2023.209.svn56468-52.1.noarch.rpm"
RPM_HASH = "96582ec236048989508c4690cf3c5c1a19ffe5b15ea5dd7c2303b131bd651fbb05df0563c8d2e8dda1bc99112686ae8cac0076103df3f357b68b9640a9d6af07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Uphon.fd \
tex-cmph10.tfm \
tex-cmph5.tfm \
tex-cmph6.tfm \
tex-cmph7.tfm \
tex-cmph8.tfm \
tex-cmph9.tfm \
tex-cmphb10.tfm \
tex-cmphi10.tfm \
tex-cmphi7.tfm \
tex-cmphi8.tfm \
tex-cmphi9.tfm \
tex-phonetic.sty \
texlive-phonetic"

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
