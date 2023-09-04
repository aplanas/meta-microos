SUMMARY = "Draws electrocardiograms (ECG)"
DESCRIPTION = "This package provides the \\ECG{<code>} command which draws \
electrocardiograms (ECG). The <code> represents a series of \
abbreviations which allow to draw different types of wave."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn41617"

RPM_NAME = "texlive-ecgdraw-2023.209.0.0.1svn41617-54.2.noarch.rpm"
RPM_HASH = "2e9e6be51086087f16477eb26b5a676846b095f75448ba808827bb6addbbb625c4654dabf61be60af92a86d0542f0a1033a7b873864599a8acdad6631c8f5446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ecgdraw.sty \
texlive-ecgdraw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
