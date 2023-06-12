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

PV = "2023.201.1.2dsvn21869"

RPM_NAME = "texlive-ltxdockit-2023.201.1.2dsvn21869-52.1.noarch.rpm"
RPM_HASH = "49a4577c8b737623230d8c0389ab7fb606287deaf5312af27b7318f27b90600962efd34ce6a9900917df3917c7e99c08e6b40ee476671fb70dcf54f3468ca777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(btxdockit.sty) \
tex(ltxdockit.cfg) \
tex(ltxdockit.cls) \
tex(ltxdockit.def) \
tex(ltxdockit.sty) \
texlive-ltxdockit"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(etoolbox.sty) \
tex(fontenc.sty) \
tex(hypcap.sty) \
tex(hyperref.sty) \
tex(ifpdf.sty) \
tex(keyval.sty) \
tex(listings.sty) \
tex(multicol.sty) \
tex(scrartcl.cls) \
tex(textcomp.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
