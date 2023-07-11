SUMMARY = "MetaPost macros for hatching interior of closed paths"
DESCRIPTION = "The file hatching.mp contains a set of MetaPost macros for \
hatching interior of closed paths. Examples of usage are \
included."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.11svn23818"

RPM_NAME = "texlive-hatching-2023.201.0.0.11svn23818-53.2.noarch.rpm"
RPM_HASH = "0ccfbda85f5e05b5c89e03739159b42767f6eee4cf8b7d6dfebd5398ec81ded86823096ce9d811bee4f699b3452ff3471b8037ddb58bdc4d35f1f849b8269f79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hatching"

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
