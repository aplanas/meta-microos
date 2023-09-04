SUMMARY = "Support for indexing"
DESCRIPTION = "The package simplifies the indexing of words using the \\index \
command of makeidx. With the package, to index a word in a \
text, you only have to type it once; the package makes sure it \
is both typeset and indexed."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.04svn46051"

RPM_NAME = "texlive-hvindex-2023.209.0.0.04svn46051-54.1.noarch.rpm"
RPM_HASH = "6d4fef79c525d0eb85fe5e8e4023b0f68a6ac403077febe5d362e583c738109e513abd754784e5ef44123b5f3dfd244e4fc0231695c40a01820693657721349b"
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
