SUMMARY = "BibTeX styles to format according to GOST"
DESCRIPTION = "BibTeX styles to format bibliographies in English, Russian or \
Ukrainian according to GOST 7.0.5-2008 or GOST 7.1-2003. Both \
8-bit and Unicode (UTF-8) versions of each BibTeX style, in \
each case offering a choice of sorted and unsorted. Further, a \
set of three styles (which do not conform to current standards) \
are retained for backwards compatibility."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2lsvn57616"

RPM_NAME = "texlive-gost-2023.201.1.2lsvn57616-53.2.noarch.rpm"
RPM_HASH = "4ce3f3914798345c9453d68bfaffca8124a442dab75de57d85de347453da9085aeb4f12b3571ff100e36294f6a52fb40cfb558d1c39154f914328050f6ae3be9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gost"

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
