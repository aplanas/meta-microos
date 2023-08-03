SUMMARY = "Multiple mathematical accents"
DESCRIPTION = "A package for multiple accents in mathematics, with nice \
features concerning the creation of accents and placement of \
scripts."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn51497"

RPM_NAME = "texlive-accents-2023.209.1.4svn51497-55.1.noarch.rpm"
RPM_HASH = "f22f30104a33e72f89903d0b964ec35e4efb9885bfea6dc26c598345687ee3eb23e7ee8f82bac510936fb9495e55a1e8b932303e0da51dade0cfb8d825a7d658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-accents.sty \
texlive-accents"

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
