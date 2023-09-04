SUMMARY = "MetaPost macros for hatching interior of closed paths"
DESCRIPTION = "The file hatching.mp contains a set of MetaPost macros for \
hatching interior of closed paths. Examples of usage are \
included."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.11svn23818"

RPM_NAME = "texlive-hatching-2023.209.0.0.11svn23818-54.2.noarch.rpm"
RPM_HASH = "fe92b56032592d6dbf9405db82da4a5c2c9db9d4d4dfb73e84cb43ef4e2952365408ab009e5400560e1942516fb0484e4c4107b64ef4554ba348fa96a29c3b3b"
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
