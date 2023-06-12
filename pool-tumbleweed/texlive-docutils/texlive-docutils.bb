SUMMARY = "Helper commands and element definitions for Docutils LaTeX output"
DESCRIPTION = "The package is intended for use with LaTeX documents generated \
from reStructuredText sources with Docutils. When generating \
LaTeX documents, specify this package with the stylesheet \
configuration option, e.g. rst2latex --stylesheet=docutils \
exampledocument.txt"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn56594"

RPM_NAME = "texlive-docutils-2023.201.svn56594-52.1.noarch.rpm"
RPM_HASH = "d98bc80bec0bf7901fbfc2c8d4281cd47a1ea23682c58595a3406068d27326d024efba6891c4920b489dea0b215bda1ffc852f7f7af8efb6949000c4cf83534d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(docutils.sty) \
texlive-docutils"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
