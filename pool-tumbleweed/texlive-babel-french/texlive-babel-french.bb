SUMMARY = "Babel contributed support for French"
DESCRIPTION = "The package, formerly known as frenchb, establishes French \
conventions in a document (or a subset of the conventions, if \
French is not the main language of the document)."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.5qsvn66513"

RPM_NAME = "texlive-babel-french-2023.209.3.5qsvn66513-54.1.noarch.rpm"
RPM_HASH = "b0a61f103a4a42eae2f5bee059ba99aaf2668a1fcd0197b936a96ff00a1af8c9293d9f61237d9fbeac6e457a0026b44f8ececc94e6371531206e38387768d283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-acadian.ldf \
tex-canadien.ldf \
tex-francais.ldf \
tex-french.ldf \
tex-frenchb.ldf \
texlive-babel-french"

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
