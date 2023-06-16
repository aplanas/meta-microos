SUMMARY = "Find the date of last modification of a file"
DESCRIPTION = "The package fetches from the system the date of last \
modification or opening of an existing file, using the function \
\\pdffilemoddate (present in recent versions of pdfTeX); the \
user may specify how the date is to be presented."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn16189"

RPM_NAME = "texlive-getfiledate-2023.201.1.2svn16189-52.1.noarch.rpm"
RPM_HASH = "3a8bd946b6c4c9a0437a79c7716b2cd448232c23119c41470ded06d15e93d4975c037886481f12306e7047c7b69fd9245e75e1cd80b5122e77906e97e9395264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-getfiledate.sty \
texlive-getfiledate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-boxedminipage.sty \
tex-etextools.sty \
tex-ltxnew.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
