SUMMARY = "Macros for curve fitting"
DESCRIPTION = "The package uses PSTricks to fit curves to: Linear Functions; \
Power Functions; exp Function; Log_{10} and Log_e functions; \
Recip; Kings Law data; Gaussian; and 4th order Polynomial"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn45109"

RPM_NAME = "texlive-pst-fit-2023.209.0.0.02svn45109-53.1.noarch.rpm"
RPM_HASH = "13eefbf46b480e98012e8c277dab7f7c4acfc7d1737db131d2adc551b4d779263c660d50099ee7db9a67b37c49f5ea4c99c9fc446bc4b14f4e1bb0c826d05991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-fit.sty \
tex-pst-fit.tex \
texlive-pst-fit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks-add.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
