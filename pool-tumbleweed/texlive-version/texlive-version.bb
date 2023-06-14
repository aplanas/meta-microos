SUMMARY = "Conditionally include text"
DESCRIPTION = "Defines macros \\includeversion{NAME} and \\excludeversion{NAME}, \
each of which defines an environment NAME whose text is to be \
included or excluded from compilation. Although the command \
syntax is very similar to that of comment, comment.sty is to be \
preferred to version.sty for documents where significant chunks \
of text may be excluded."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn21920"

RPM_NAME = "texlive-version-2023.201.2.0svn21920-53.1.noarch.rpm"
RPM_HASH = "9e997fc56f806be5f133cb14b338d0d973dfe82d672682b2fa1d116804c853fd1d9bcba99cda0da0d8bed68803381c8a5504be5fbef9cd3ff962298831df2bac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-version.sty \
texlive-version"

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
