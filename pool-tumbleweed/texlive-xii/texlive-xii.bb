SUMMARY = "Christmas silliness (English)"
DESCRIPTION = "This is the plain TeX file xii.tex. Call 'pdftex xii.tex' to \
produce a (perhaps) surprising typeset document."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45804"

RPM_NAME = "texlive-xii-2023.209.svn45804-53.2.noarch.rpm"
RPM_HASH = "83e9af6f9fdb7be03ffcca294f3a5ee5312c5751e10a3d035052ca25a2029729c1fc6c8c886842103c45ee3fdbc46c29a58f51a0197c28669c868ba2c7d1e05f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xii"

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
