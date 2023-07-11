SUMMARY = "Convert one DVI file into another"
DESCRIPTION = "The output DVI file's contents are specified by page selection \
commands; series of pages and page number ranges may be \
specified, as well as inclusions and exclusions."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65952"

RPM_NAME = "texlive-dvidvi-2023.201.svn65952-53.2.noarch.rpm"
RPM_HASH = "994f6ada52a59c45eacbd68e04c2a440c7b1f8cbcff0033d75e941c4ec168626fd87e6fcb14b4e188b31d607c9ff0df8b0fb23831e1f111a365d05b3675cd2f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvidvi.1 \
texlive-dvidvi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dvidvi-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
