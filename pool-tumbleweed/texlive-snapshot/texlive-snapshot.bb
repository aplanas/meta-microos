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

PV = "2023.209.2.14svn56735"

RPM_NAME = "texlive-snapshot-2023.209.2.14svn56735-58.1.noarch.rpm"
RPM_HASH = "82d31dcb0f8735ad515cc6369657d74eba786c6f668cc11e3675aa5797d8cf4d592ef65bc8aa293668873c1a051c77c7b141fb02ef7bda4ef328b641ae570897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-snapshot.sty \
texlive-snapshot"

RDEPENDS:${PN} += "/usr/bin/sh \
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
