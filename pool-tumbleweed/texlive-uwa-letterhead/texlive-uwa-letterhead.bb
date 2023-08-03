SUMMARY = "The letterhead of the University of Western Australia"
DESCRIPTION = "This package generates the letterhead of the University of \
Western Australia. It requires the UWA logo in PDF format, \
which is available in SVG format at \
https://static-listing.weboffice.uwa.edu.au/visualid/core-rebra \
nd/img/uwacrest/, and uses the Arial and UWA Slab fonts by \
default. The package works with XeLaTeX and LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn64491"

RPM_NAME = "texlive-uwa-letterhead-2023.209.1.0.1svn64491-54.1.noarch.rpm"
RPM_HASH = "5087461afb40eec37cf9bcc0bab37c74e9397aec105cf5cdca2a7d6c95b4f9b551c4e57154f82ed378b017d8c6e14fcff32e84ff65a2614494e1050ba198621f"
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
