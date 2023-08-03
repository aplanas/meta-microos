SUMMARY = "Add a Navigation Path to the page header"
DESCRIPTION = "This package adds a navigation path ('breadcrumb trail') at the \
header of a presentation, just like some websites do in order \
to simplify navigation."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.1svn64602"

RPM_NAME = "texlive-crumbs-2023.209.0.0.4.1svn64602-55.1.noarch.rpm"
RPM_HASH = "77c2ed799decc0542d5a2319573d6b31b85e10b21e6d082498ac43dc76e51c26e7182a75b6a2d6a38dcfaf1c1612ce23f388ed003d3aa7030e475dac25357a02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crumbs.sty \
texlive-crumbs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-etoolbox.sty \
tex-xkeyval.sty \
texlive \
texlive-catchfile \
texlive-etoolbox \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-xkeyval"

inherit rpm
