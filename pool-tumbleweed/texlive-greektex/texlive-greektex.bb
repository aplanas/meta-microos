SUMMARY = "Fonts for typesetting Greek/English documents"
DESCRIPTION = "The fonts are based on Silvio Levy's classical Greek fonts; \
macros and Greek hyphenation patterns for the fonts' encoding \
are also provided."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn28327"

RPM_NAME = "texlive-greektex-2023.201.svn28327-53.1.noarch.rpm"
RPM_HASH = "be5e24f6e7700f5f1528c36704eaa18ce2b33ae9060e1e45f042c55e53b7f90a23a29fea812249d17311d8484cbe1b0b06dd1198c2b402ee9ff4e6b3cb268dac"
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
