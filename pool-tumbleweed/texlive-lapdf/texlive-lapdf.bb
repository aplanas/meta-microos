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

PV = "2023.209.1.1svn23806"

RPM_NAME = "texlive-lapdf-2023.209.1.1svn23806-56.1.noarch.rpm"
RPM_HASH = "23fa498fb4aeecc944f8b3e20bb256dd586e49544a8beb20e14f785eeb306d53664435bd87c5e87accb481ec2c4a639f76229bfe46fff429903d62d75e892822"
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
