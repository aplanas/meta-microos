SUMMARY = "Helper commands and element definitions for Docutils LaTeX output"
DESCRIPTION = "The package is intended for use with LaTeX documents generated \
from reStructuredText sources with Docutils. When generating \
LaTeX documents, specify this package with the stylesheet \
configuration option, e.g. rst2latex --stylesheet=docutils \
exampledocument.txt"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn56594"

RPM_NAME = "texlive-docutils-2023.209.svn56594-53.1.noarch.rpm"
RPM_HASH = "3e0fb3032e954c4728517a624d89815b8ccec16cab18e218c6eaf8441ca77991a9fd47decc9b1c08f0c5eef81ed7e629d99bf99ca51600f4fba60f4de2be1ef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-docutils.sty \
texlive-docutils"

RDEPENDS:${PN} += "/usr/bin/sh \
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
