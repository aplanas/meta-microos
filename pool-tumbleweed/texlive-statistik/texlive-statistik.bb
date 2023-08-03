SUMMARY = "Store statistics of a document"
DESCRIPTION = "The package counts the numbers of pages per chapter, and stores \
the results in a separate file; the format of the file is \
selectable."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.03svn20334"

RPM_NAME = "texlive-statistik-2023.209.0.0.03svn20334-58.1.noarch.rpm"
RPM_HASH = "123fcdca5331d009cf877736c995ffab5dcb8172878256ee3682d4f3fd1a2ce774094a3e94d401ee810ce210fbe5652a19dbd9498f2aa97f1c96ced3620a7ec7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-statistik.sty \
texlive-statistik"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
