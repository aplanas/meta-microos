SUMMARY = "Definitions from the Open Color library"
DESCRIPTION = "This package provides hexadecimal color definitions of the 130 \
colors included in the Open Color library."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn66363"

RPM_NAME = "texlive-opencolor-2023.209.1.0.1svn66363-55.1.noarch.rpm"
RPM_HASH = "ba37424498372546af6ad44ad8cfa26ac14badf28d64fc550ccb885b0408803ecf34900a0859ba112830c62bce84167a266586e1a58bfd9d06582230ee39f32c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-opencolor.sty \
texlive-opencolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
