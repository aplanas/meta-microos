SUMMARY = "Documentation for texlive-ctan-o-mat"
DESCRIPTION = "This package includes the documentation for texlive-ctan-o-mat"
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.2svn51578"

RPM_NAME = "texlive-ctan-o-mat-doc-2023.209.1.2svn51578-55.1.noarch.rpm"
RPM_HASH = "566999e3360e7185aa4e704f0d75ba3dab62c49dfaad752fe4836cb77ca3434f000d08da2f35730f24575e2e875622370ee4d24af90d95175616940331f991dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-ctan-o-mat.1 \
texlive-ctan-o-mat-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
