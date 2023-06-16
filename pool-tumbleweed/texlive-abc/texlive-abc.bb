SUMMARY = "Support ABC music notation in LaTeX"
DESCRIPTION = "The abc package lets you include lines of music written in the \
ABC Plus language. The package will then employ the \\write18 \
facility to convert your notation to PostScript (using the \
established utility abcm2ps) and hence to the format needed for \
inclusion in your document."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn41157"

RPM_NAME = "texlive-abc-2023.201.2.0bsvn41157-54.1.noarch.rpm"
RPM_HASH = "deb2a325f6e2df103742633030ee140e416849fa30d1c1e062f02a0b1b8bb354814d370457ba4065e6a361515f25f8e0ca06ae9d9ecff2c4fe67749042d5f462"
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
