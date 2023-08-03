SUMMARY = "Compute the mass of a printed version of a document"
DESCRIPTION = "The package computes the number of sheets of paper used by, and \
hence the mass of a document. This is useful (for example) when \
calculating postal charges."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0hsvn23667"

RPM_NAME = "texlive-papermas-2023.209.1.0hsvn23667-52.1.noarch.rpm"
RPM_HASH = "bf66905e03447b2d5270ec2223a86dafbc35fd3a71571834b6ef1d524d7b77a3c14d738dbd6c17872a0766163e9b3d6da801ae60089ebb5085130d8a3f62b2f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-papermas.sty \
texlive-papermas"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-intcalc.sty \
tex-kvoptions.sty \
tex-pageslts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
