SUMMARY = "Documentation macros for the TKZ series of packages"
DESCRIPTION = "This bundle offers a documentation class (tkz-doc) and a \
package (tkzexample). These files are used in the documentation \
of the author's packages tkz-base, tkz-euclide, tkz-fct, \
tkz-linknodes, and tkz-tab."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.45csvn66115"

RPM_NAME = "texlive-tkz-doc-2023.209.1.45csvn66115-53.1.noarch.rpm"
RPM_HASH = "0d470cdabfcf723c7a3f055032eabb63b81d1ba427ad0973ddc0bcbc6c6a0681a8ab3ee97f0eb3aa93f1a571da60b8170757d70ac02ffff6e07a37690e962ea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkz-doc"

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
