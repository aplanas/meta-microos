SUMMARY = "A DVI previewer for the X Window System"
DESCRIPTION = "The canonical previewer for use on Unix and other X-windows \
based systems. The distribution has been integrated with that \
of xdvik (no longer separately available), so that it will \
build with web2c 'out of the box'. It is included in TeX Live."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn62387"

RPM_NAME = "texlive-xdvi-2023.209.svn62387-53.1.noarch.rpm"
RPM_HASH = "69d483a02195528d720ee17702e17b52d67f3ff51fb8312b3db3159c2daa5c5982c06666d52f264732e46b0aac69a6b14100d301eb76f56d9a45cc10a1605550"
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
