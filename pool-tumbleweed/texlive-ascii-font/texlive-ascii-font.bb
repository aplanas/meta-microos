SUMMARY = "Use the ASCII 'font' in LaTeX"
DESCRIPTION = "The package provides glyph and font access commands so that \
LaTeX users can use the ASCII glyphs in their documents. The \
ASCII font is encoded according to the IBM PC Code Page 437 C0 \
Graphics. This package replaces any early LaTeX 2.09 package \
and 'font' by R. Ramasubramanian and R.W.D. Nickalls."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn29989"

RPM_NAME = "texlive-ascii-font-2023.201.2.0svn29989-53.1.noarch.rpm"
RPM_HASH = "59af5a6d8b8c41b5690d399a71a12660b5296589bd19698a75d9f9c57278ca08075c84793254c243dac41cc40c05817b996c427e7f1b528d022375511e4b3be9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ASCII.tfm \
tex-ascii.map \
tex-ascii.sty \
texlive-ascii \
texlive-ascii-font"

RDEPENDS:${PN} += "/bin/sh \
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
