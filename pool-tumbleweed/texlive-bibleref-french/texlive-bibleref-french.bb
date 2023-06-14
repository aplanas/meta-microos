SUMMARY = "French translations for bibleref"
DESCRIPTION = "The package provides translations and alternative typesetting \
conventions for use of bibleref in French."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3.3svn53138"

RPM_NAME = "texlive-bibleref-french-2023.201.2.3.3svn53138-53.1.noarch.rpm"
RPM_HASH = "51436d91b9e9acc1cc1d54122a9ef7e75ce9b06c5a2f6981d6d28e4af129f5d5549afe9ceed6a07939e9b29ba7a401c40c23efbe70d46c38374deaf124d6a5aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibleref-french.sty \
texlive-bibleref-french"

RDEPENDS:${PN} += "/bin/sh \
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
