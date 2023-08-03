SUMMARY = "Provides a figure-like environment that break over pages"
DESCRIPTION = "The longfigure package uses and relabels components of the \
well-known longtable package, written by David Carlisle, to \
provide a table-like environment that can display a stream of \
figures as a single figure that can break across pages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn34302"

RPM_NAME = "texlive-longfigure-2023.209.1.0svn34302-55.1.noarch.rpm"
RPM_HASH = "c9210d68122197866019fbaacd443e07fdd266c49ae750e9dba0bde43ba823c67bcbf57a25770b1a4d318f8110bc1a36d0008dd1a23f370301ba02a66804345e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-longfigure.sty \
texlive-longfigure"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tocloft.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
