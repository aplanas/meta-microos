SUMMARY = "Decorative chapter headings"
DESCRIPTION = "A package for creating decorative chapter headings with \
quotations. Uses graphical and coloured output and by default \
needs the 'Adobe standard font set' (as supported by psnfss)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn56926"

RPM_NAME = "texlive-quotchap-2023.201.1.3svn56926-53.2.noarch.rpm"
RPM_HASH = "92c26554e692b5ab6329c6219181b53c9c9fa424ab931687ef98e7e5364903001b12da494db516bda0c0125cd0ec67303b18048bc90c597e9b1547215ef9d9e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quotchap.sty \
texlive-quotchap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
