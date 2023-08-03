SUMMARY = "Japanese version of A Short Introduction to LaTeX2e"
DESCRIPTION = "The lshort-japanese package"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn36207"

RPM_NAME = "texlive-lshort-japanese-2023.209.svn36207-55.1.noarch.rpm"
RPM_HASH = "15627b2893676032416b384df0d07ea1ac3d8f68e348f87c72c7bbd3bafa61c3ff6d8c33343bec149d034acefa3fdaaa43fb37871f15f3e6bda44337ab5edd9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-japanese"

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
