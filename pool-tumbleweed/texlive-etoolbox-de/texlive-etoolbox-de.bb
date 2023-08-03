SUMMARY = "German translation of documentation of etoolbox"
DESCRIPTION = "The version translated is 2.1 or 2011-01-03."
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn21906"

RPM_NAME = "texlive-etoolbox-de-2023.209.1svn21906-53.1.noarch.rpm"
RPM_HASH = "ad89171d720c60abfa7127dcdc797a10b6d57a9e68d833ec719305411ba89236cc4620dcc6bbd35010479b0a7eab574af9b9b1a59694646a372b05f3430d4511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etoolbox-de"

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
