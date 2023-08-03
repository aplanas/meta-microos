SUMMARY = "Create index with pagerefs"
DESCRIPTION = "Third parties often change the page numbers without rerunning \
makeindex. One would like to make the page numbers in the index \
entries more robust. This bundle provides robustindex.sty and \
robustglossary.sty, which use the \\pageref mechanism to \
maintain correct page numbers."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn49877"

RPM_NAME = "texlive-robustindex-2023.209.svn49877-54.1.noarch.rpm"
RPM_HASH = "641c80c4bd05b84ec21e044bf7585215b7a8ca746f9514fda2bd893c021367c5036bf650a6b88b2b23633d685e79d922e65463546a24415533753f627fb03f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-robustglossary.sty \
tex-robustindex.sty \
texlive-robustindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-makeidx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
