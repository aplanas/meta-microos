SUMMARY = "Printing ornaments"
DESCRIPTION = "The package uses PSTricks to draw ornaments (a substantial \
repertoire of ornaments is provided)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.41svn60488"

RPM_NAME = "texlive-pst-vectorian-2023.209.0.0.41svn60488-54.2.noarch.rpm"
RPM_HASH = "68c8093520e7527ce37d4241beeff7dd4ddd10311b070d0d5b1fa6722d5ca75ce37978ca0d8e8bbefe41369540377f7a8864f5f04d4dff162cb6b6407b86f24d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-psvectorian.sty \
texlive-pst-vectorian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
