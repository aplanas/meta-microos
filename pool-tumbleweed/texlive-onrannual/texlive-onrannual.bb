SUMMARY = "Class for Office of Naval Research Ocean Battlespace Sensing annual report"
DESCRIPTION = "This is an unofficial document class for writing ONR annual \
reports using LaTeX; as ONR has had numerous problems with \
LaTeX-generated PDF submissions in the past. A skeleton \
document (and its PDF output) are included."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn17474"

RPM_NAME = "texlive-onrannual-2023.201.1.1svn17474-54.1.noarch.rpm"
RPM_HASH = "52ad6c39a9b5e3612756c724e625abd2cdbe73848ec27011f3e6d817f9b9e993eede45e45c0e43c80027e77125545d076f8b900f6733a0f7411969ee29a0cd5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(onrannual.cls) \
texlive-onrannual"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(authblk.sty) \
tex(caption.sty) \
tex(geometry.sty) \
tex(hyperref.sty) \
tex(mathptmx.sty) \
tex(parskip.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
