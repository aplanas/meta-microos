SUMMARY = "French translations for bibleref"
DESCRIPTION = "The package provides translations and alternative typesetting \
conventions for use of bibleref in French."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3.3svn53138"

RPM_NAME = "texlive-bibleref-french-2023.209.2.3.3svn53138-54.1.noarch.rpm"
RPM_HASH = "f49cfc0b1b04d40bae7c310d6120bd1d8f02b6eb8b716e4d3ac2a486e47dd841ae89903ea0f99068292f2b9f2cd8c688c51650408e7c1d32b93bf4012ea395e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibleref-french.sty \
texlive-bibleref-french"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bibleref.sty \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
