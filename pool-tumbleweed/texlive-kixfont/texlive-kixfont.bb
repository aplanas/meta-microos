SUMMARY = "A font for KIX codes"
DESCRIPTION = "The KIX code is a barcode-like format used by the Dutch PTT to \
encode country codes, zip codes and street numbers in a \
machine-readable format. If printed below the address line on \
bulk mailings, a discount can be obtained. The font is \
distributed in Metafont format, and covers the numbers and \
upper-case letters."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn18488"

RPM_NAME = "texlive-kixfont-2023.209.svn18488-56.1.noarch.rpm"
RPM_HASH = "448f19fcd4ae2126550b0951031cf1928d58cbd1d7994d4cb3863a03b8bf702d20f290e7aae207ca2ed00f5d8feba1a0a87bc670159738e93bf62c02b5febac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kix.tfm \
texlive-kixfont"

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
