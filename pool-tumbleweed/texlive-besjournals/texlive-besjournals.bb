SUMMARY = "Bibliographies suitable for British Ecological Society journals"
DESCRIPTION = "The package provides a BibTeX style for use with journals \
published by the British Ecological Society. The style was \
produced independently of the Society, and has no formal \
approval by the BES."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45662"

RPM_NAME = "texlive-besjournals-2023.201.svn45662-53.1.noarch.rpm"
RPM_HASH = "e855eb85f1bbc404319aba281d50f05cf1402156f605024a215f9bd6b2d94f79314466c9367c7dbe35ba13b363ceb96ae98184f4a7a464fd7a53e86fd8e499a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-besjournals"

RDEPENDS:${PN} += "/bin/sh \
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
