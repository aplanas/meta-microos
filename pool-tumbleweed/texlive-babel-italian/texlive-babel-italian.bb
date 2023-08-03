SUMMARY = "Babel support for Italian text"
DESCRIPTION = "The package provides language definitions for use in babel."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.07svn62890"

RPM_NAME = "texlive-babel-italian-2023.209.1.4.07svn62890-54.1.noarch.rpm"
RPM_HASH = "81e897f0bc8c21edafaf474f9e88aa5d7ab720661995718d17f351103352d7e643e23438dbc5e27721b2db624172eef496d2af6ab3b17b43b9094a739367c4ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-italian.ldf \
texlive-babel-italian"

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
