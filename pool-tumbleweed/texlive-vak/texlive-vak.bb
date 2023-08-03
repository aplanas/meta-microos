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

PV = "2023.209.svn23431"

RPM_NAME = "texlive-vak-2023.209.svn23431-54.1.noarch.rpm"
RPM_HASH = "5e4d2f71433da3d9fa32e39bed6a8539ce876ac91f869e88aae66f153383b17ab2f828f99ac9a392496dd6ba366d10df1d9318923c5c5c311b2fe861635bb317"
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
