SUMMARY = "A DVI previewer for the X Window System"
DESCRIPTION = "The canonical previewer for use on Unix and other X-windows \
based systems. The distribution has been integrated with that \
of xdvik (no longer separately available), so that it will \
build with web2c 'out of the box'. It is included in TeX Live."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn62387"

RPM_NAME = "texlive-xdvi-2023.209.svn62387-53.2.noarch.rpm"
RPM_HASH = "61d1cfeaaa9604c52f39f84756813c02761bf43d603bc1e630c4f92a233342e75e3496ca6b70cb5220fd62d2b1b8db803547720b52462437f0a812a16afbb106"
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
