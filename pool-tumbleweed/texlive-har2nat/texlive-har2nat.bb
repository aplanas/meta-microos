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

RPM_NAME = "texlive-har2nat-2023.201.1.0svn54080-53.1.noarch.rpm"
RPM_HASH = "9d1fe712967dc13872cc1531343052c2d49e6e62737536fc9ae08ed97abc6bd83d410308e7a19fae875299d4c55c4b8b1ad1f5a627a142f5693e26df790789ac"
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
