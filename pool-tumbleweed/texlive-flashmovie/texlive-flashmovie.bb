SUMMARY = "Directly embed flash movies into PDF files"
DESCRIPTION = "The package allows direct embedding of flash movies into PDF \
files. It is designed for use with pdfLaTeX. The package takes \
advantage of the embedded Adobe Flash player in Adobe Reader 9; \
the reader is invoked with the 'rich media annotation' feature, \
described in 'Adobe Supplement to the ISO 32000 BaseVersion: \
1.7 ExtensionLevel: 3'. This method of embedding movies is \
attractive since it removes all platform dependencies; however, \
the user is required to use Acrobat 9."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn25768"

RPM_NAME = "texlive-flashmovie-2023.209.0.0.4svn25768-53.1.noarch.rpm"
RPM_HASH = "e2b6ff4888974a159aaa066204d38ad6cc8b94101cd2d7decca903f0f3a5d24bbc12d41fa25230e012fba4658ccf1edd34a9ca01ddd709028be0d8be0db842d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flashmovie.sty \
texlive-flashmovie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
