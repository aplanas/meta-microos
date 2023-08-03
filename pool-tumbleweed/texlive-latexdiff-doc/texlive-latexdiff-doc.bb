SUMMARY = "Documentation for texlive-latexdiff"
DESCRIPTION = "This package includes the documentation for texlive-latexdiff"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3.3svn64980"

RPM_NAME = "texlive-latexdiff-doc-2023.209.1.3.3svn64980-55.1.noarch.rpm"
RPM_HASH = "b01a068b785bdfffd11667fa3cb85d10828afd17dea8e5ca80049c74c9a3acd88cb8ae52c44c3bcab91c78135418e6f0db5ceb3e2046f7d5d070296eac80adba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-latexdiff-vc.1 \
man-latexdiff.1 \
man-latexrevise.1 \
texlive-latexdiff-doc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3"

inherit rpm
