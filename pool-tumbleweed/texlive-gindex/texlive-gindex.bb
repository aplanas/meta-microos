SUMMARY = "Formatting indexes"
DESCRIPTION = "This package provides a way to generate the format of index \
entries from within LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn52311"

RPM_NAME = "texlive-gindex-2023.209.0.0.2svn52311-53.1.noarch.rpm"
RPM_HASH = "4674a94f341f614ecc8165e1d812dbcaac022497d688f9fa6cd67683568bb6b734563a77862f6f4d3de273a2cb0f3b3dff0a0d8d9a7fa57081650ee78a8dfa8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gindex.sty \
texlive-gindex"

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
