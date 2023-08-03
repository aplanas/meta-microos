SUMMARY = "Documentation for texlive-texdoc"
DESCRIPTION = "This package includes the documentation for texlive-texdoc"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.0.1svn66227"

RPM_NAME = "texlive-texdoc-doc-2023.209.4.0.1svn66227-55.1.noarch.rpm"
RPM_HASH = "14a1d51927e4ddcc8cd87705bdeecac65f0b93bf89d6b4cb5d8180d6510940d2024db4404eb3aa4a22e56b8f5cfbf03e82f9d626c5fd1b3090770db6412ba04a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texdoc.1 \
texlive-texdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
