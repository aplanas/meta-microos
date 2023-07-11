SUMMARY = "Replace the harvard package with natbib"
DESCRIPTION = "This small package allows a LaTeX document containing the \
citation commands provided by the Harvard package to be \
compiled using the natbib package. Migration from harvard to \
natbib thus can be achieved simply by replacing \
\\usepackage{harvard} with usepackage{natbib} \
usepackage{har2nat} It is important that har2nat be loaded \
after natbib, since it modifies natbib commands."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-har2nat-2023.201.1.0svn54080-53.2.noarch.rpm"
RPM_HASH = "65e1fdf3dd5df3235fcdbdb959b6ce170704446522e4ece2b82a37bf578fc9344270a0e5d08bea71c70fcc7e1951513415f3fbf499f9eff34897b1d9fc3333a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-har2nat.sty \
texlive-har2nat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-natbib.sty \
tex-suffix.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
