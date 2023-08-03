SUMMARY = "Various macros for keeping things local"
DESCRIPTION = "A toolbox of macros designed to allow the LaTeX programmer to \
work around some of the restrictions of the TeX grouping \
mechanisms. The present release offers a preliminary view of \
the package; not all of its facilities are working optimally"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn20422"

RPM_NAME = "texlive-locality-2023.209.0.0.2svn20422-55.1.noarch.rpm"
RPM_HASH = "f44bb5d3ec2f43f7398fdc7149c5d9f9d718338e5bce4019e2e9c0e0f692a890a6a4fb719961584d16c8055cda6706d5a622ace9c57640324bb97e30148f9fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-locality.sty \
texlive-locality"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
