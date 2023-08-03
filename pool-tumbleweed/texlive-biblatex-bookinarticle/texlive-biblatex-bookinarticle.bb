SUMMARY = "Manage book edited in article"
DESCRIPTION = "This package provides three new BibLaTeX entry types - \
@bookinarticle, @bookinincollection and @bookinthesis - to \
refer to a modern edition of an old book, where this modern \
edition is provided in a @article, @incollection or in a \
@thesis. The package is now superseded by biblatex-bookinother."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.1asvn40323"

RPM_NAME = "texlive-biblatex-bookinarticle-2023.209.1.3.1asvn40323-54.1.noarch.rpm"
RPM_HASH = "33f11f63c04dde76dac34bd4addcc051ecae4fc2d8af276122afdc8e77ba2025f78ce2c2fc6f93f013bba950d3033298ae468b363aa47d62ca679ce14e76ae28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-bookinarticle.sty \
texlive-biblatex-bookinarticle"

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
