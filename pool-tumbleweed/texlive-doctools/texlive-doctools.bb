SUMMARY = "Tools for the documentation of LaTeX code"
DESCRIPTION = "The package provides a collection of tools for use either in an \
'ordinary' LaTeX document, or within a .dtx file."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn34474"

RPM_NAME = "texlive-doctools-2023.209.0.0.1svn34474-53.1.noarch.rpm"
RPM_HASH = "fd8a665ff6914ec63ad7c60bd4877213c03110a8a2efc2aec56aac475cd8ee209d5686b3e61451e4e5931ce8305b5ba046c72a71335efb6a7e447dd6276062b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-doctools.sty \
texlive-doctools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bookmark.sty \
tex-cmap.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-kvoptions-patch.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-listings.sty \
tex-pdftexcmds.sty \
tex-textcomp.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
