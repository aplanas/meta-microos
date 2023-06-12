SUMMARY = "Subscripts and superscripts with square brackets"
DESCRIPTION = "A LaTeX package to write alternative and customisable \
subscripts and superscripts, with square brackets in the source \
code."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn62738"

RPM_NAME = "texlive-altsubsup-2023.201.1.1svn62738-54.1.noarch.rpm"
RPM_HASH = "145d0bbab35689cab541bf42c973f55f4d07758e29b8d51d0da3cb003f5f191a275f459c7a7e6e0477f68e402a8dee619edd1592a2a20fb0d7e14f9e04674243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(altsubsup.sty) \
texlive-altsubsup"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amstext.sty) \
tex(spbmark.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
