SUMMARY = "BibTeX style for Russian Theses, books, etcetera"
DESCRIPTION = "The file can be used to format the bibliographies of PhD \
theses, books etc., according to the latest Russian standards: \
GOST 7.82 - 2001 and GOST 7.1 - 2003. It introduces the minimum \
number of new entries and styles to cover all frequently used \
situations. The style file provides an easy way to perform a \
semiautomatic, or a completely manual sort of the list of the \
references. Processing bibliographies produced by the style \
requires a 8-bit BibTeX system."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn23431"

RPM_NAME = "texlive-vak-2023.201.svn23431-53.1.noarch.rpm"
RPM_HASH = "43b65a87c62e2b164b2f358a4db1ccc0dc9c5a3a220937d8194a33eed3e01d65dfbb0b3b3b672ebcf5eabfee0514685f045e4be8346c5c6ee6ed23dc9e4e8aed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vak"

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
