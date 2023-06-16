SUMMARY = "Fit graphics on a page"
DESCRIPTION = "The package allows a box (usually an \\includegraphics box) to \
fit on the page. It scales the box to the maximal allowed size \
within the user-set limits. If there is not enough space on the \
page, the box is moved to the next one."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn50088"

RPM_NAME = "texlive-fitbox-2023.201.1.02svn50088-52.1.noarch.rpm"
RPM_HASH = "958481d5beba511ad0f5e4a941dd085d189adcbbbbbefd0c04b21e136daeeea2fa3f92c53480bcebcca38cde46891804a28901e1a27a9566904108e0132c25ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fitbox.sty \
texlive-fitbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
