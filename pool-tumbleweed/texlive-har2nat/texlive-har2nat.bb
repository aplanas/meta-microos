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

RPM_NAME = "texlive-har2nat-2023.209.1.0svn54080-54.1.noarch.rpm"
RPM_HASH = "772cfd2e3f3614b56605dd76a8f10ba9ebc2590e5211e59177cbc317656056d9010b8cfe0adc7dec0a73511895e0cab27bc16485fc635c47faec0af74123d00e"
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
