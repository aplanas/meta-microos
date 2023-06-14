SUMMARY = "Format papers for the annual meeting of EEGS"
DESCRIPTION = "The class provides formatting for papers for the annual meeting \
of the Environmental and Engineering Geophysical Society (EEGS) \
('Application of Geophysics to Engineering and Environmental \
Problems', known as SAGEEP)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-sageep-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "d0e4be1e86f01ebc49cf938b972f1b558c01d2035ce1d8a15f4631d9049b11da95dda2d5c5d577bb23d25303a99d8e270e7bb92231b63c88da7456642f110108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sageep.cls \
texlive-sageep"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-caption.sty \
tex-courier.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-indentfirst.sty \
tex-mathptmx.sty \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
