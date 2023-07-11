SUMMARY = "A Unicode font, with rather wide coverage"
DESCRIPTION = "The package provides a set of outline (i.e. OpenType) fonts \
covering as much as possible of the Unicode character set. The \
set consists of three typefaces: one monospaced and two \
proportional (one with uniform and one with modulated stroke)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn29349"

RPM_NAME = "texlive-gnu-freefont-2023.201.svn29349-53.2.noarch.rpm"
RPM_HASH = "8e46574eab8ab7f3cf8c41ed2dc923edb47be3e0c63f8405250876726a648714ca477b22ac171bbf55d076afde4df0edabc67ed41fd40fa0373a87988c552e80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gnu-freefont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-gnu-freefont-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
