SUMMARY = "A macro to format section numbering intuitively"
DESCRIPTION = "This package provides a macro \\setsecnum to format section \
numbering intuitively. \\setsecnum{1.1.1} will set the section \
numbering format to arabic.arabic.arabic and the depth to 3. \
The package uses LaTeX3."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61813"

RPM_NAME = "texlive-secnum-2023.209.svn61813-54.1.noarch.rpm"
RPM_HASH = "be95a8685f60967963661012a9c4a6a0d8f57dbb992c8958147d8b64471446b58b6593d4435f4aefd0ccacbcc615c8cccf7974abd7008e2538c672f68b01b47f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-secnum.sty \
texlive-secnum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
