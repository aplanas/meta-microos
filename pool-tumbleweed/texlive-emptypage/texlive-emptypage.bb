SUMMARY = "Make empty pages really empty"
DESCRIPTION = "This package prevents page numbers and headings from appearing \
on empty pages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn18064"

RPM_NAME = "texlive-emptypage-2023.209.1.2svn18064-54.2.noarch.rpm"
RPM_HASH = "fc714c1a4f35375eec6cc13a30bb77ac4029a0b67dd386f5b1d90f9360d275463f09f10cf1396ad796c345cf29c82c9bbac27f9f57e3ba7a2cdc67213d1517c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emptypage.sty \
texlive-emptypage"

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
