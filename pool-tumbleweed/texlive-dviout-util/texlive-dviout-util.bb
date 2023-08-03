SUMMARY = "Package dviout-util"
DESCRIPTION = "The dviout-util package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-dviout-util-2023.209.svn66186-54.1.noarch.rpm"
RPM_HASH = "69abdc93c123c56d6e6d8b7f498943575cf7e4235464ce973aaa5ceb36f8a84e51a68c57050747ae3876644fe626181851b5d48c83a5b2a24be8781386877a4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-chkdvifont.1 \
man-dvispc.1 \
texlive-dviout-util"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dviout-util-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
