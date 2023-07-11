SUMMARY = "Generate BibTeX entries for various IETF index files"
DESCRIPTION = "The package provides scripts to translate IETF index files to \
BibTeX files."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0.0svn41332"

RPM_NAME = "texlive-ietfbibs-2023.208.1.0.0svn41332-53.1.noarch.rpm"
RPM_HASH = "ddb718704d78234ec1759589fb8d223caaf544246926e7af1380daacc0629b0abe0e533a2ed10e6795f114f3d3db142690c8049559fb17bca6ae2828227e14c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ietfbibs"

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
