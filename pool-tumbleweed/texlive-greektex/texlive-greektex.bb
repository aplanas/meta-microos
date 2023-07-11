SUMMARY = "Fonts for typesetting Greek/English documents"
DESCRIPTION = "The fonts are based on Silvio Levy's classical Greek fonts; \
macros and Greek hyphenation patterns for the fonts' encoding \
are also provided."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn28327"

RPM_NAME = "texlive-greektex-2023.201.svn28327-53.2.noarch.rpm"
RPM_HASH = "047d1179a46ff9a7fe174f425d53a2c6089a89ffdfb1f9c2c94416b513cde10d4708ec6b99eb414dddff3a402793eab42ed887b509bd1d051bb2ee9b116286dc"
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
