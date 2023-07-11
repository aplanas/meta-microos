SUMMARY = "Hyper extensions for doc.sty"
DESCRIPTION = "This package adds hypertext features to the package doc that is \
used in the documentation system of LaTeX2e. Bookmarks are \
added and references are linked as far as possible."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.18svn65678"

RPM_NAME = "texlive-hypdoc-2023.208.1.18svn65678-53.1.noarch.rpm"
RPM_HASH = "afb0f9702b9f6f377325ac498160656dc57043023f6aafb13bb001a51cb6a49c4e916978c4f9e31f824d5b4a3d6530f8c1bd1d2ebd18006f5477f5fc3fc0f5da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hypdoc.sty \
texlive-hypdoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atveryend.sty \
tex-calc.sty \
tex-doc.sty \
tex-rerunfilecheck.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
