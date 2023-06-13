SUMMARY = "Hyper extensions for doc.sty"
DESCRIPTION = "This package adds hypertext features to the package doc that is \
used in the documentation system of LaTeX2e. Bookmarks are \
added and references are linked as far as possible."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.18svn65678"

RPM_NAME = "texlive-hypdoc-2023.201.1.18svn65678-52.1.noarch.rpm"
RPM_HASH = "04adf6fbe0bf0a8c45f3b4d7c7aed0b48b9d70a52da2b85412e0a24f5e9f2faaff359ed9808bc46cdd11401970b11b71c0a8a4da61e87d65d560f7523a648a1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hypdoc.sty) \
texlive-hypdoc"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(atveryend.sty) \
tex(calc.sty) \
tex(doc.sty) \
tex(rerunfilecheck.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
