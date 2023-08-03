SUMMARY = "Typeset CD covers"
DESCRIPTION = "Normal usage will ordinarily require no more than a simple data \
file per cover; the package will make a full insert for a CD \
case (it copes with both normal and slim cases)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.4svn34452"

RPM_NAME = "texlive-cd-2023.209.1.4svn34452-53.1.noarch.rpm"
RPM_HASH = "e6de64764d8e74a4c445ae3ce78cdcb639a8b8d483130ff81655aa70e92d6e98742f96574a282567efdecab4aa06ab9c8100f62fc3a71291eb456493455a5248"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cd.cls \
texlive-cd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-rotating.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
