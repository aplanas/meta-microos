SUMMARY = "Support for creating a change log"
DESCRIPTION = "Vhistory simplifies the creation of a history of versions of a \
document. You can easily extract information like the current \
version of a list of authors from that history. It helps you to \
get consistent documents. The package sets, which is used by \
vhistory, allows you to use sets containing text. You can use \
the usual operations to create the union of sets or the \
intersection of sets etc."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8.0svn61719"

RPM_NAME = "texlive-vhistory-2023.209.1.8.0svn61719-54.1.noarch.rpm"
RPM_HASH = "e2d4495d9ab096f79784a779b94f4e76f37c7f77c8d0711248e185542e7016a6f2bf1713974433647ad27c293c4a2c6d832f0979e7c0938942c83cb8e5c8e196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sets.sty \
tex-vhistory.sty \
texlive-vhistory"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ltxtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
