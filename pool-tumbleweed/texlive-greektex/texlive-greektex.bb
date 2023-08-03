SUMMARY = "Fonts for typesetting Greek/English documents"
DESCRIPTION = "The fonts are based on Silvio Levy's classical Greek fonts; \
macros and Greek hyphenation patterns for the fonts' encoding \
are also provided."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn28327"

RPM_NAME = "texlive-greektex-2023.209.svn28327-54.1.noarch.rpm"
RPM_HASH = "23c2744864641b9e8ba9ad5b09305677d6fe08981b150f8bf724975ea34ca161dd5a4f793b93e858cc5dc121a04b1a612404772390c7ef44bc70ec9b87eac4b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-greektex.sty \
texlive-greektex"

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
