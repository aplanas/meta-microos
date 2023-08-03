SUMMARY = "Use the ASCII 'font' in LaTeX"
DESCRIPTION = "The package provides glyph and font access commands so that \
LaTeX users can use the ASCII glyphs in their documents. The \
ASCII font is encoded according to the IBM PC Code Page 437 C0 \
Graphics. This package replaces any early LaTeX 2.09 package \
and 'font' by R. Ramasubramanian and R.W.D. Nickalls."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn29989"

RPM_NAME = "texlive-ascii-font-2023.209.2.0svn29989-54.1.noarch.rpm"
RPM_HASH = "f9b1b46f0202a44e184d2a4dba84b3ccfb931668039d3d990d5177e0c64b84b94b54676dcf69e40b8e9a56c6a93c8a7ed2b3929f95675507da0d69e5361a057f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ASCII.tfm \
tex-ascii.map \
tex-ascii.sty \
texlive-ascii \
texlive-ascii-font"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
tex-xspace.sty \
texlive \
texlive-ascii-font-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
