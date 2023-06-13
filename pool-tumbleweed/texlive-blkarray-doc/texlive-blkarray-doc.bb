SUMMARY = "Documentation for texlive-blkarray"
DESCRIPTION = "This package includes the documentation for texlive-blkarray"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.07svn36406"

RPM_NAME = "texlive-blkarray-doc-2023.201.0.0.07svn36406-52.1.noarch.rpm"
RPM_HASH = "ee0bc5e79e6582e42832e64e3ff3034750e964337cfb16c9525b0196858316f94cd2a67be231ad0403cfcafc01037edc242ac7cb2d6c3801b87eb93193918a3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blkarray-doc"

RDEPENDS:${PN} += ""

inherit rpm
