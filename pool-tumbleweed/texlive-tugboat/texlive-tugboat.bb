SUMMARY = "LaTeX macros for TUGboat articles"
DESCRIPTION = "Provides ltugboat.cls for both regular and proceedings issues \
of the TUGboat journal. Also provides a BibTeX style, \
tugboat.bst."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.29svn66513"

RPM_NAME = "texlive-tugboat-2023.201.2.29svn66513-52.1.noarch.rpm"
RPM_HASH = "ae4bdd4946d8fc8cff445c973332cfef6f6c370586e02342f581962838d3774c29caa50ea2bf7f4555af2e250bbbe9631d9cbac1c1286047507552af82fbcf27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ltugboat.cls) \
tex(ltugboat.sty) \
tex(ltugcomn.sty) \
tex(ltugproc.cls) \
tex(ltugproc.sty) \
texlive-tugboat"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(mflogo.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
