SUMMARY = "Support for indexing"
DESCRIPTION = "The package simplifies the indexing of words using the \\index \
command of makeidx. With the package, to index a word in a \
text, you only have to type it once; the package makes sure it \
is both typeset and indexed."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.04svn46051"

RPM_NAME = "texlive-hvindex-2023.201.0.0.04svn46051-52.1.noarch.rpm"
RPM_HASH = "adb340f4af9f57640e9041325e06f6675f226b8cbd03d25e557f496a4a31c2934af5a37c35643eb62793f8ebb9f7d6a62e3bc8c74795207e10198256a8c434ce"
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
