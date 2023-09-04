SUMMARY = "Replace the harvard package with natbib"
DESCRIPTION = "This small package allows a LaTeX document containing the \
citation commands provided by the Harvard package to be \
compiled using the natbib package. Migration from harvard to \
natbib thus can be achieved simply by replacing \
\\usepackage{harvard} with usepackage{natbib} \
usepackage{har2nat} It is important that har2nat be loaded \
after natbib, since it modifies natbib commands."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-har2nat-2023.209.1.0svn54080-54.2.noarch.rpm"
RPM_HASH = "fe306d6653c6d2c1c19f149fc5006e1363b97bd79ad53dd7f779bc25b78812792d4f6c049b7e928c1d03b3a5d16bca4f5a39312cacf9aee22b7fc23188ca6bd7"
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
