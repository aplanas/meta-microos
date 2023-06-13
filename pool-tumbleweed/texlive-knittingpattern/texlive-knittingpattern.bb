SUMMARY = "Create knitting patterns"
DESCRIPTION = "The class provides a simple, effective method for knitters to \
produce high-quality, attractive patterns using LaTeX. It does \
this by providing commands to handle as much of the layout of \
the document as possible, leaving the author free to \
concentrate on the pattern."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17205"

RPM_NAME = "texlive-knittingpattern-2023.201.svn17205-55.1.noarch.rpm"
RPM_HASH = "b2f7569cf6b7aaaae285aa9ebf6f31c592af22e40aed26d3e494354fcd054a8446ec78ff5c6467679c2fd5572be7348b5c24b95d93051301c8c3d5a92db6abb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(knittingpattern.cls) \
texlive-knittingpattern"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(calc.sty) \
tex(fancyhdr.sty) \
tex(float.sty) \
tex(graphicx.sty) \
tex(longtable.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
