SUMMARY = "Draws electrocardiograms (ECG)"
DESCRIPTION = "This package provides the \\ECG{<code>} command which draws \
electrocardiograms (ECG). The <code> represents a series of \
abbreviations which allow to draw different types of wave."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn41617"

RPM_NAME = "texlive-ecgdraw-2023.201.0.0.1svn41617-53.2.noarch.rpm"
RPM_HASH = "cbb15f2b443233f0faff5e4e4a373c60f5673d222cb908b27b0f9c1c998d389cffe82e3500d7f7bc87d9d22bb2ae72c5b319052a419e5d57ed7dd85673a31ee7"
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
