SUMMARY = "Support for creating a change log"
DESCRIPTION = "Vhistory simplifies the creation of a history of versions of a \
document. You can easily extract information like the current \
version of a list of authors from that history. It helps you to \
get consistent documents. The package sets, which is used by \
vhistory, allows you to use sets containing text. You can use \
the usual operations to create the union of sets or the \
intersection of sets etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8.0svn61719"

RPM_NAME = "texlive-vhistory-2023.201.1.8.0svn61719-53.1.noarch.rpm"
RPM_HASH = "3d38dedc7f3364fca8dba5999ea147b953a5053103cbbb51142371819f13806b7dc93dc05720eda8bdfda130e800b5dff6e91591f1bd7223a60dbaa4afb3bb95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sets.sty \
tex-vhistory.sty \
texlive-vhistory"

RDEPENDS:${PN} += "/bin/sh \
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
