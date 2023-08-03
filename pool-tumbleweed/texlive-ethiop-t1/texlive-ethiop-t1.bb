SUMMARY = "Type 1 versions of Amharic fonts"
DESCRIPTION = "These fonts are drop-in Adobe type 1 replacements for the fonts \
of the ethiop package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-ethiop-t1-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "e1554d17587169d8dd6924b6b5b0595bbb8fb1e8d560f767918858b5854fd2796942059f4ce368ae7b56544e7f087b8a85ab66b612c1e7a4aa72377d28b73cfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ethiop.map \
texlive-ethiop-t1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-ethiop-t1-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
