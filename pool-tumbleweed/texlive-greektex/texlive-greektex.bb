SUMMARY = "Fonts for typesetting Greek/English documents"
DESCRIPTION = "The fonts are based on Silvio Levy's classical Greek fonts; \
macros and Greek hyphenation patterns for the fonts' encoding \
are also provided."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn28327"

RPM_NAME = "texlive-greektex-2023.209.svn28327-54.2.noarch.rpm"
RPM_HASH = "62876749d003d9ef009bf8140bebc47aab553be6a1c5fc67bfd8a0a63718562861bad5dc2eb368010fa908f5d8f93faa10923b3ef63f87986c5d822fde44a317"
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
