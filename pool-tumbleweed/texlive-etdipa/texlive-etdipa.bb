SUMMARY = "Simple, lightweight template for scientific documents"
DESCRIPTION = "This package provides a complete working directory for the \
scientific documentation of arbitrary projects. It was \
originally developed to provide a template for Austrian \
'Diplomarbeiten' or 'Vorwissenschaftliche Arbeiten', which are \
scientfic projects of students at a secondary school."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6svn36354"

RPM_NAME = "texlive-etdipa-2023.209.2.6svn36354-53.1.noarch.rpm"
RPM_HASH = "50821a762f6b9f709a429bd8fd50f54568c536ab731ac915dafd3d8d4c6f3693d242454b1c7b95d8c031a9c2bd14c717079fcacf2a3ca1ce7a063dc05ff5b5e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etdipa"

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
