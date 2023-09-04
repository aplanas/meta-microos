SUMMARY = "Documentation for texlive-hatching"
DESCRIPTION = "This package includes the documentation for texlive-hatching"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.11svn23818"

RPM_NAME = "texlive-hatching-doc-2023.209.0.0.11svn23818-54.2.noarch.rpm"
RPM_HASH = "01e3fbb1524a7b357224171eb701881776439667e137e107b8d94a114744f53a74947c14383801dbcd2d61055b32bb66a02851db78a0a8efbdb1460bbfe1959a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hatching-doc"

RDEPENDS:${PN} += ""

inherit rpm
