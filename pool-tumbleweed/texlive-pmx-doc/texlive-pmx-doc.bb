SUMMARY = "Documentation for texlive-pmx"
DESCRIPTION = "This package includes the documentation for texlive-pmx"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.00svn65926"

RPM_NAME = "texlive-pmx-doc-2023.209.3.00svn65926-53.1.noarch.rpm"
RPM_HASH = "98caafd58f507632d42ea2c95be188bd1a29a667e2b4ab64294adfc49c30cc69c207cf64f0e70b70654b74f0a414e2655443b42a73391f4039a40c905bbfdedc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pmxab.1 \
man-scor2prt.1 \
texlive-pmx-doc"

RDEPENDS:${PN} += ""

inherit rpm
