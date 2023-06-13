SUMMARY = "Poor man ISO math for pdfLaTeX users"
DESCRIPTION = "This small package realizes a poor man approximation of the ISO \
regulations for physical sciences and technology. Contrary to \
other more elegant solutions, it does not load any math \
alphabet, since pdfLaTeX can use only a maximum of such \
alphabets. The necessary user macros are defined for typsetting \
common math symbols that require special ISO treatment."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.00svn60368"

RPM_NAME = "texlive-pm-isomath-2023.201.1.2.00svn60368-52.1.noarch.rpm"
RPM_HASH = "7c72cc08e27c236b005efc191a072e1d22da9ba9319202416a827477957e6b8191e636f25d0d82e2306e7564c220a64a943145aaa317d7eccc0c0d46cbc889b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pm-isomath.sty) \
texlive-pm-isomath"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(alphabeta.sty) \
tex(amsmath.sty) \
tex(etoolbox.sty) \
tex(iftex.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
