SUMMARY = "A DVI previewer for the X Window System"
DESCRIPTION = "The canonical previewer for use on Unix and other X-windows \
based systems. The distribution has been integrated with that \
of xdvik (no longer separately available), so that it will \
build with web2c 'out of the box'. It is included in TeX Live."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn62387"

RPM_NAME = "texlive-xdvi-2023.201.svn62387-52.2.noarch.rpm"
RPM_HASH = "8859b9cd55ca563ffdfbb20253f6ccacb29e7b4209d76106a7fdae45ad0f0e0a449d0a2955598f75ff66ea88ccb87db058fa2924c5d4ea8a6e1b96e0b7d628c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-xdvi \
texlive-xdvi"

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
texlive-scripts-bin \
texlive-xdvi-bin"

inherit rpm
