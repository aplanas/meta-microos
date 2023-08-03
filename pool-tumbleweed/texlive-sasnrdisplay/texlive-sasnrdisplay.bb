SUMMARY = "Typeset SAS or R code or output"
DESCRIPTION = "The SASnRdisplay package serves as a front-end to listings, \
which permits statisticians and others to import source code \
and the results of their calculations or simulations into LaTeX \
projects. The package is also capable of overloading the Sweave \
User Manual and SASweave packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.95svn63255"

RPM_NAME = "texlive-sasnrdisplay-2023.209.0.0.95svn63255-54.1.noarch.rpm"
RPM_HASH = "bc9e544c30c38b59e5b04499435fd8c0a85038f6fb239230189f0a174fa3f709f0b687afde4537d236631c23b75d6bbbe7b93840f1b2ab0c0cc21bb5d908d48d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-SASnRdisplay.cfg \
tex-SASnRdisplay.sty \
texlive-sasnrdisplay"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-etoolbox.sty \
tex-listings.sty \
tex-needspace.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
