SUMMARY = "Create index with pagerefs"
DESCRIPTION = "Third parties often change the page numbers without rerunning \
makeindex. One would like to make the page numbers in the index \
entries more robust. This bundle provides robustindex.sty and \
robustglossary.sty, which use the \\pageref mechanism to \
maintain correct page numbers."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn49877"

RPM_NAME = "texlive-robustindex-2023.201.svn49877-53.1.noarch.rpm"
RPM_HASH = "8f24b15ab061c7e55d921bb293b657448f4ee0620b341bffa1d0461f02de771922b890c15992778e0c3e543d8244408952eeea644435a0f8cfc8130228ea512c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(robustglossary.sty) \
tex(robustindex.sty) \
texlive-robustindex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(makeidx.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
