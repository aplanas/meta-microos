SUMMARY = "Practical manual for LaTeX (Finnish)"
DESCRIPTION = "'Kaytannollista Latexia' is a practical manual for LaTeX \
written in the Finnish language. The manual covers most of the \
topics that a typical document author needs. So it can be a \
useful guide for beginners as well as a reference manual for \
advanced users."
LICENSE = "LPPL-1.0"

PV = "2023.209.2023svn65461"

RPM_NAME = "texlive-kaytannollista-latexia-2023.209.2023svn65461-56.1.noarch.rpm"
RPM_HASH = "68f72ff6298f8741cefa7cfd691728fc24777da4bfd7e627e3ed1b3af8f7926e3ef41bfaac131115e1a33f930ad4ed714550b04e0a421a6c586d9275e62d15a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kaytannollista-latexia"

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
