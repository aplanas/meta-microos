SUMMARY = "Manage book edited in article"
DESCRIPTION = "This package provides three new BibLaTeX entry types - \
@bookinarticle, @bookinincollection and @bookinthesis - to \
refer to a modern edition of an old book, where this modern \
edition is provided in a @article, @incollection or in a \
@thesis. The package is now superseded by biblatex-bookinother."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.1asvn40323"

RPM_NAME = "texlive-biblatex-bookinarticle-2023.201.1.3.1asvn40323-53.1.noarch.rpm"
RPM_HASH = "940cbdf90ca24ae53ac527b7bbb60257e20241ae414eeb6635369b8f9c297e32bc82fae8e0d1fb6b5a3b06b5dd6409843000937922972e79706001626a6340c9"
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
