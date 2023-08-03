SUMMARY = "Support ABC music notation in LaTeX"
DESCRIPTION = "The abc package lets you include lines of music written in the \
ABC Plus language. The package will then employ the \\write18 \
facility to convert your notation to PostScript (using the \
established utility abcm2ps) and hence to the format needed for \
inclusion in your document."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn41157"

RPM_NAME = "texlive-abc-2023.209.2.0bsvn41157-55.1.noarch.rpm"
RPM_HASH = "ef28eab6a5468acd2865034941e785589d5d8fecbe1662abd6772704267f192f62f880c5f4e238bdf63905c1d093a95de8a32d87881bdf74a7e93ce92fa9fb46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abc.sty \
tex-mup.sty \
texlive-abc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-keyval.sty \
tex-shellesc.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
