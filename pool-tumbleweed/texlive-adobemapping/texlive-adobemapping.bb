SUMMARY = "Adobe cmap and pdfmapping files"
DESCRIPTION = "The package comprises the collection of CMap and PDF mapping \
files made available for distribution by Adobe."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn66552"

RPM_NAME = "texlive-adobemapping-2023.209.svn66552-55.1.noarch.rpm"
RPM_HASH = "d2a9d9fa639692375dde45caccc6a52b3addd53993e85c10f36091dfc5733251fabba83a0d7812669870f530800599e606c520b9422b4fa548f3b0bbf569a825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adobemapping"

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
