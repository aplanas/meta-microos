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

PV = "2023.209.0.0.9svn37297"

RPM_NAME = "texlive-persian-bib-2023.209.0.0.9svn37297-52.1.noarch.rpm"
RPM_HASH = "bca6bbe44b4fe778001d5346e8e9f6ee48d4a82dc8a902227789cb07897cf21dd7109b31942b0e520999f5f318a37e2872644e39c0ab1ba49dd3779b185b9bf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-persian-bib"

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
