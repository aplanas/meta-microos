SUMMARY = "Some symbols created using TikZ"
DESCRIPTION = "The package provides various emoticons, cooking symbols and \
trees."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.12asvn61300"

RPM_NAME = "texlive-tikzsymbols-2023.201.4.12asvn61300-52.1.noarch.rpm"
RPM_HASH = "67788cce4d75f1a1c80d49a3498eebfaca5913db08006dca1a1084a452b0b52a4a7092905db5ea76b1eb90746104dcd42b7343bc93971c6b81d01b5142a2dbbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzsymbols.sty) \
texlive-tikzsymbols"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(l3keys2e.sty) \
tex(tikz.sty) \
tex(xcolor.sty) \
tex(xparse.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
