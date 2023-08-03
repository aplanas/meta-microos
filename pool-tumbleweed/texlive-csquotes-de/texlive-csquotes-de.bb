SUMMARY = "German translation of csquotes documentation"
DESCRIPTION = "This is a translation of the documentation of csquotes version \
5.1."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn23371"

RPM_NAME = "texlive-csquotes-de-2023.209.1.01svn23371-55.1.noarch.rpm"
RPM_HASH = "12b25b5ed164675d54b9b896c0ceace6fd0bef17b794ba9f4dbbeb7ce08ab4077abb6166335fb5588e1332a1929be5c5b3ed6e17c092a86808221e36abad80db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-csquotes-de"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
