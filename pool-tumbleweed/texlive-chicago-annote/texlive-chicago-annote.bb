SUMMARY = "Chicago-based annotated BibTeX style"
DESCRIPTION = "This is a revision of chicagoa.bst, using the commonly-used \
annote field in place of the original's annotation."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-chicago-annote-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "e0427dd90a4954958682fc7b362190b1d6c07202f4825352926e903a968c4bac31e01bc93c74d2d3cde0609cd5117f026b7968d70be998510d0e5f4036b22c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chicago-annote"

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
