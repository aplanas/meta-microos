SUMMARY = "Compile differently based on the filename"
DESCRIPTION = "This package allows to compile a document differently depending \
on the portion of the document's file name (internally, the \
\\jobname) that comes after the first '-' character. This allows \
one to have one source file and multiple links to this source \
file that each compile differently."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn64797"

RPM_NAME = "texlive-jobname-suffix-2023.201.1.0svn64797-55.1.noarch.rpm"
RPM_HASH = "2c51e24991a5ee41f165afedc4b10e9e2de48c1e8da3630023996bfeb6bf673bf5fde1f925896d406939b1c7083477e9c6d25de6a85a481f1d10dd9ea7ee7cbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(jobname-suffix.sty) \
texlive-jobname-suffix"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
