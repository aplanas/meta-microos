SUMMARY = "A Participant Information Form (PIF) for a human research protocol at the University of Western Australia"
DESCRIPTION = "This package generates a Participant Information Form (PIF) for \
a human research protocol at the University of Western \
Australia. It requires the UWA logo in PDF format, which is \
available in SVG format at \
https://static-listing.weboffice.uwa.edu.au/visualid/core-rebra \
nd/img/uwacrest/, and uses the Calibri fonts by default. The \
class works with XeLaTeX and LuaLaTeX. It depends on the \
uwa-letterhead package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn64491"

RPM_NAME = "texlive-uwa-pif-2023.209.1.0.1svn64491-54.1.noarch.rpm"
RPM_HASH = "eb98b460e7f47be148c4b71135e90d324552d51e7df5fc3c288c9455b6d47a87406aa83c0f7afde816d20a004c4899508a22e7f652f6499847c193b31592fd3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uwa-pif.cls \
texlive-uwa-pif"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-article.cls \
tex-fontspec.sty \
tex-setspace.sty \
tex-titlesec.sty \
tex-uwa-letterhead.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
