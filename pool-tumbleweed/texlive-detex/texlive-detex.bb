SUMMARY = "Strip TeX from a source file"
DESCRIPTION = "Detex is a program to remove TeX constructs from a text file. \
It recognizes the \\input command. The program assumes it is \
dealing with LaTeX input if it sees the string \\begin{document} \
in the text. In this case, it also recognizes the \\include and \
\\includeonly commands. The author now considers this program to \
be 'retired' and Piotr Kubowicz's OpenDetex as its successor."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-detex-2023.209.svn66186-53.1.noarch.rpm"
RPM_HASH = "00fb77b5a035c8961c4f8133748486d00888aa91fc6d92f81b3c9be5aa0818597cf4b9a37d96d4845b7a9703212afd1870e007c544242203bc8da76dcfd87c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-detex.1 \
texlive-detex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-detex-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
