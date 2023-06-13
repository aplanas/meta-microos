SUMMARY = "Persian translations of classic BibTeX styles"
DESCRIPTION = "Currently 9 files: acm-fa.bst, asa-fa.bst, chicago-fa.bst, \
ieeetr-fa.bst, plain-fa-inLTR-beamer.bst, plain-fa-inLTR.bst, \
plain-fa.bst, plainnat-fa.bst and unsrt-fa.bst are modified for \
Persian documents prepared with XePersian (which the present \
package depends on). The Persian .bst files can simultaneously \
handle both Latin and Persian references. A file cp1256fa.csf \
is provided for correct sorting of Persian references and three \
fields LANGUAGE, TRANSLATOR and AUTHORFA are defined."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn37297"

RPM_NAME = "texlive-persian-bib-2023.201.0.0.9svn37297-51.1.noarch.rpm"
RPM_HASH = "1b9d712214d1a725bebcbe47d2b5cc082bb6f36d14149859ce9da13c3441b8cbbfbd4c55ff695827fe9af648b605e2befa61319935d3ff349f67659764fa4b67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-persian-bib"

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
