SUMMARY = "Strip TeX from a source file"
DESCRIPTION = "Detex is a program to remove TeX constructs from a text file. \
It recognizes the \\input command. The program assumes it is \
dealing with LaTeX input if it sees the string \\begin{document} \
in the text. In this case, it also recognizes the \\include and \
\\includeonly commands. The author now considers this program to \
be 'retired' and Piotr Kubowicz's OpenDetex as its successor."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-detex-2023.201.svn66186-52.1.noarch.rpm"
RPM_HASH = "41bf16d167e490bea992685e2c43f5de8a893c949436259ffdcb6233137df4d93d178c02fa40b950a0962eb079f46d705e25ff214109c732977751178afee068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(detex.1) \
texlive-detex"
RDEPENDS:${PN} += "/bin/sh \
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
