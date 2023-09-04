SUMMARY = "Hyper extensions for doc.sty"
DESCRIPTION = "This package adds hypertext features to the package doc that is \
used in the documentation system of LaTeX2e. Bookmarks are \
added and references are linked as far as possible."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.18svn65678"

RPM_NAME = "texlive-hypdoc-2023.209.1.18svn65678-54.1.noarch.rpm"
RPM_HASH = "80bb04a28efc7b045f6c131cd4d05affeac45d317bf9d4546d45ba1db7d214e4438e44b50b36ccaa9d5f5543fe6e2326e641994acf9be320536e24a0c3a180f6"
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
