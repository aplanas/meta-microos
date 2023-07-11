SUMMARY = "Semantic commands for adding formatted index entries"
DESCRIPTION = "The package provides commands for adding formatted index \
entries; it arises from the author's work on large documents."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2csvn54554"

RPM_NAME = "texlive-idxcmds-2023.208.0.0.2csvn54554-53.1.noarch.rpm"
RPM_HASH = "fc2c44cfedf6711f57e14615a7545c956b123a7ac32b820ec38cee4431490b0bec72cb495ef834bdcee617a3ea8d9b05e6d87ccd1667fbdeb8380a1268d102e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-idxcmds.sty \
texlive-idxcmds"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ltxcmds.sty \
tex-pgfopts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
