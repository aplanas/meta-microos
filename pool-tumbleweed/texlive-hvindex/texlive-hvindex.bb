SUMMARY = "Support for indexing"
DESCRIPTION = "The package simplifies the indexing of words using the \\index \
command of makeidx. With the package, to index a word in a \
text, you only have to type it once; the package makes sure it \
is both typeset and indexed."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.04svn46051"

RPM_NAME = "texlive-hvindex-2023.208.0.0.04svn46051-53.1.noarch.rpm"
RPM_HASH = "d89e6d554889b08c5e1109ae71e22061d61b64604affb11f085552a7abe159c42fc0cf15ea8bf82a782a5c5eddf72ac4ecfdf1cd5a01d264e5ba6af518a27913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hvindex.sty \
texlive-hvindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-makeidx.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
