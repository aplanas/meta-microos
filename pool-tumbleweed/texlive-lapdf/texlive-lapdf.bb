SUMMARY = "PDF drawing directly in TeX documents"
DESCRIPTION = "The package provides the means to use PDF drawing primitives to \
produce high quality, colored graphics. It uses Bezier curves \
(integral and rational) from degree one to seven, allows TeX \
typesetting in the graphic, offers most of the standard math \
functions, allows plotting normal, parametric and polar \
functions. The package has linear, logx, logy, logxy and polar \
grids with many specs; it can rotate, clip and do many nice \
things easily it has two looping commands for programming and \
many instructive example files. The package requires pdfTeX but \
otherwise only depends on the calc package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn23806"

RPM_NAME = "texlive-lapdf-2023.201.1.1svn23806-55.1.noarch.rpm"
RPM_HASH = "83abe1600170f649818472cbb888aa277f2b6a059fc3f6d39fdcefa1f801d6ac80d24fbab4c17238c765d7d9a4ef43dbd4c37aa92378854614047a3c4e3d0bb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lapdf.sty \
texlive-lapdf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
