SUMMARY = "Bibliographies suitable for British Ecological Society journals"
DESCRIPTION = "The package provides a BibTeX style for use with journals \
published by the British Ecological Society. The style was \
produced independently of the Society, and has no formal \
approval by the BES."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45662"

RPM_NAME = "texlive-besjournals-2023.209.svn45662-54.1.noarch.rpm"
RPM_HASH = "652bde43457de04fe09f11e288959a8b4462d35cf6050fe9878fd8880f5bb17e512903ba02f2b15ce51b2872679bac76c733893043e8efeddb137c5ab1e4dcb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-besjournals"

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
