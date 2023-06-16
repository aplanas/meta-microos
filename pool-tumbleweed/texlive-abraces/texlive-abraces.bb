SUMMARY = "Asymmetric over-/underbraces in maths"
DESCRIPTION = "The package provides a character key-driven interface to \
supplement new constructions of the traditional \\overbrace and \
\\underbrace pairs in an asymmetric or arbitrary way."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn64967"

RPM_NAME = "texlive-abraces-2023.201.2.1svn64967-54.1.noarch.rpm"
RPM_HASH = "c784ec5b7f50925644fafb15023deabc59e44279436fb897acba47ed7c7b5a2f93f6cd2173aa3b3690fc44a822529fe18ba0ba0737926eb6739ac2289e1d828f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abraces.sty \
texlive-abraces"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
