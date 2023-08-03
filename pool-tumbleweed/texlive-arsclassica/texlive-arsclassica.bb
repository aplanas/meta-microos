SUMMARY = "A different view of the ClassicThesis package"
DESCRIPTION = "The package changes some typographical points of the \
ClassicThesis style, by Andre Miede. It enables the user to \
reproduce the look of the guide The art of writing with LaTeX \
(the web page is in Italian)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45656"

RPM_NAME = "texlive-arsclassica-2023.209.svn45656-54.1.noarch.rpm"
RPM_HASH = "aea90f5160c97382a7a80174a91e6ed56d902836dd3f5f6213c6bc533381f52623511611fd14b40467a74e90ccc10567bfaa1c98629bcfa68ec659b10e9ad6e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arsclassica.sty \
texlive-arsclassica"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-classicthesis.sty \
tex-soul.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
