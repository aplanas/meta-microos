SUMMARY = "MetaPost macros for hatching interior of closed paths"
DESCRIPTION = "The file hatching.mp contains a set of MetaPost macros for \
hatching interior of closed paths. Examples of usage are \
included."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.11svn23818"

RPM_NAME = "texlive-hatching-2023.209.0.0.11svn23818-54.1.noarch.rpm"
RPM_HASH = "b92c641b731858714b574056a88f59ea75fecb59f79cc7d2338743315560c40f05e4d64e9796118fc4d224f6ba41bc01b5b2f7885bf640716c0072ad0cac6361"
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
