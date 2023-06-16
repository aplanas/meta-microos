SUMMARY = "MetaPost macros for hatching interior of closed paths"
DESCRIPTION = "The file hatching.mp contains a set of MetaPost macros for \
hatching interior of closed paths. Examples of usage are \
included."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.11svn23818"

RPM_NAME = "texlive-hatching-2023.201.0.0.11svn23818-53.1.noarch.rpm"
RPM_HASH = "cb82c8e194b929e3c6d8b9537d04e2e17aa04fbe3e02b3ca902e8a878545e577aae376522e4e160d0a83a4ed69604f8c72145b04fbf72445bdcef2fc3319c1be"
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
