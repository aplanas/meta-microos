SUMMARY = "Thumb marks in documents"
DESCRIPTION = "Place thumb marks in books, manuals and reference maunals."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn16549"

RPM_NAME = "texlive-thumb-2023.201.1.0svn16549-54.1.noarch.rpm"
RPM_HASH = "97c8a1eb4044d5371e6e36505b2f9b0fdb60f86f6cbfb505830369687d07717bcd5378801a2474c59cc0dbc62afe43542ef2608ece1f2212d2ddf30e5ae7db40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(thumb.sty) \
texlive-thumb"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fancyhdr.sty) \
tex(minitoc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
