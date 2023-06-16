SUMMARY = "Underscored LaTeX hyperlinks"
DESCRIPTION = "This LaTeX package makes hyperlinks underscored, just like on \
the web. The package uses hyperref and ulem."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.0svn64880"

RPM_NAME = "texlive-href-ul-2023.201.0.0.3.0svn64880-53.1.noarch.rpm"
RPM_HASH = "2cc8a05c41775d57149bcc900945067015bb250363f1223843bedc9c1f57b161473b9d0050f7f61be1288c8080f276ea2e34011e2ab9eaa6a033313c645f013d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-href-ul.sty \
texlive-href-ul"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-hyperref \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-ulem"

inherit rpm
