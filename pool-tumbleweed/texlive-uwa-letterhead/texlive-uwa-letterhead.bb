SUMMARY = "The letterhead of the University of Western Australia"
DESCRIPTION = "This package generates the letterhead of the University of \
Western Australia. It requires the UWA logo in PDF format, \
which is available in SVG format at \
https://static-listing.weboffice.uwa.edu.au/visualid/core-rebra \
nd/img/uwacrest/, and uses the Arial and UWA Slab fonts by \
default. The package works with XeLaTeX and LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn64491"

RPM_NAME = "texlive-uwa-letterhead-2023.201.1.0.1svn64491-53.1.noarch.rpm"
RPM_HASH = "1220a43b3c4df2da1c97d428f29dccfa348030955d40c48a8ce13ac846438df45cc9a5bd0f2f3028c7a5ee4c5ad0198c7a7a196282544687ce4e7f5826fd2573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uwa-letterhead.sty \
texlive-uwa-letterhead"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-microtype.sty \
tex-sourcecodepro.sty \
tex-sourcesanspro.sty \
tex-stringstrings.sty \
tex-textpos.sty \
tex-titlesec.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
