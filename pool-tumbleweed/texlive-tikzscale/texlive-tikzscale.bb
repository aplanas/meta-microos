SUMMARY = "Resize pictures while respecting text size"
DESCRIPTION = "The package extends the \\includegraphics command to support \
tikzpictures. It allows scaling of TikZ images and PGFPlots to \
a given width or height without changing the text size."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.6svn30637"

RPM_NAME = "texlive-tikzscale-2023.201.0.0.2.6svn30637-52.1.noarch.rpm"
RPM_HASH = "529c6da1aa768becd7db86ca2a6d0d8dd02a9418a16e6fd9c491ab4c60746fc1cde20fcade3d62c4309327d0fb91df381816a29e4933af936eacff104e97f42e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzscale.sty) \
texlive-tikzscale"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(graphicx.sty) \
tex(letltxmacro.sty) \
tex(pgfkeys.sty) \
tex(xparse.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
