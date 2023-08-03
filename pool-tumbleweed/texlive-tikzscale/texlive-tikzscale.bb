SUMMARY = "Resize pictures while respecting text size"
DESCRIPTION = "The package extends the \\includegraphics command to support \
tikzpictures. It allows scaling of TikZ images and PGFPlots to \
a given width or height without changing the text size."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.6svn30637"

RPM_NAME = "texlive-tikzscale-2023.209.0.0.2.6svn30637-53.1.noarch.rpm"
RPM_HASH = "abcd6ad17f7d5a5d19c9bd456411661c1d5abbab56b22bc7e60f984a1d71f0c424598003956b796d6af14791fe68018c67461b1f053544e93924a332b90c86a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzscale.sty \
texlive-tikzscale"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-letltxmacro.sty \
tex-pgfkeys.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
