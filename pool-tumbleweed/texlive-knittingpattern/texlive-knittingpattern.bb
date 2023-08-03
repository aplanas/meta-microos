SUMMARY = "Create knitting patterns"
DESCRIPTION = "The class provides a simple, effective method for knitters to \
produce high-quality, attractive patterns using LaTeX. It does \
this by providing commands to handle as much of the layout of \
the document as possible, leaving the author free to \
concentrate on the pattern."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17205"

RPM_NAME = "texlive-knittingpattern-2023.209.svn17205-56.1.noarch.rpm"
RPM_HASH = "4d98663e8c0abd21de6345922c3bbb57dc65c6e5cf211ea4e8eb3c8bcb78743f3e172373fea14563aeac21280178fb898ac204265a0c258c4c3504092075e504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-knittingpattern.cls \
texlive-knittingpattern"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-calc.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-graphicx.sty \
tex-longtable.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
