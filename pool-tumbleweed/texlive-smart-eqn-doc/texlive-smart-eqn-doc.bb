SUMMARY = "Documentation for texlive-smart-eqn"
DESCRIPTION = "This package includes the documentation for texlive-smart-eqn"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-smart-eqn-doc-2023.201.1.0svn61719-57.1.noarch.rpm"
RPM_HASH = "fd3892afe98716102ee078089ff27d25edeffc671b9caa410495bb233a659322f9ecc056982fea13946cd09e00bd4304154f244e9d13230d7490caece9d31c2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-smart-eqn-doc"

RDEPENDS:${PN} += ""

inherit rpm
