SUMMARY = "Documentation support"
DESCRIPTION = "This bundle, consisting of a simple wrapper class and some \
packages, forms a small LaTeX/BibTeX documentation kit; the \
author uses it for some of his own packages. The package is not \
supported: users should not attempt its use unless they are \
capable of dealing with problems unaided. (The actual purpose \
of releasing the package is to make it possible for third \
parties to compile the documentation of other packages, should \
that be necessary.)"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2dsvn21869"

RPM_NAME = "texlive-ltxdockit-2023.208.1.2dsvn21869-53.1.noarch.rpm"
RPM_HASH = "bd92f0fdb598a0a78b8136d919642c64a06e6effac5573f82191a3a420dee44aa853cf8b7b3f1bfa4906a36f188fd6fa86c020e26f821d003a7c7a91eb61944f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-btxdockit.sty \
tex-ltxdockit.cfg \
tex-ltxdockit.cls \
tex-ltxdockit.def \
tex-ltxdockit.sty \
texlive-ltxdockit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-keyval.sty \
tex-listings.sty \
tex-multicol.sty \
tex-scrartcl.cls \
tex-textcomp.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
