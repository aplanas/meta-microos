SUMMARY = "List the external dependencies of a LaTeX document"
DESCRIPTION = "The snapshot package helps the owner of a LaTeX document obtain \
a list of the external dependencies of the document, in a form \
that can be embedded at the top of the document. It provides a \
snapshot of the current processing context of the document, \
insofar as it can be determined from inside LaTeX. If a \
document contains such a dependency list, then it becomes \
possible to arrange that the document be processed always with \
the same versions of everything, in order to ensure the same \
output. This could be useful for someone wanting to keep a \
LaTeX document on hand and consistently reproduce an identical \
DVI file from it, on the fly; or for someone wanting to shield \
a document during the final stages of its production cycle from \
unexpected side effects of routine upgrades to the TeX system."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.14svn56735"

RPM_NAME = "texlive-snapshot-2023.201.2.14svn56735-57.1.noarch.rpm"
RPM_HASH = "dc2b8d5f5b0225da0504487cbf40d17dc291f8e4f541c530d8edcf066c77d90ce43e61fb4269178ab259a16cf11da752c703ebb3211ce26981edecb7e3481d99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(snapshot.sty) \
texlive-snapshot"
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
