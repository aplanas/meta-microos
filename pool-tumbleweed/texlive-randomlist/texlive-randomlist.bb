SUMMARY = "Deal with database, loop, and random in order to build personalized exercises"
DESCRIPTION = "The main aim of this package is to work on lists, especially \
with random operations. The hidden aim is to build a personnal \
collection of exercises with different data for each pupil."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn45281"

RPM_NAME = "texlive-randomlist-2023.209.1.3svn45281-54.1.noarch.rpm"
RPM_HASH = "6ad5e624de21ceaa70e0a532c6304bf9d74436270960ffa2717af881010437c01f77cdec5a3b7de9fcec3eed9b9ffb235f1783d912877afc13e720518e84d821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-randomlist.sty \
tex-randomlist.tex \
texlive-randomlist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
