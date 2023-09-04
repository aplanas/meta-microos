SUMMARY = "Documentation for texlive-infwarerr"
DESCRIPTION = "This package includes the documentation for texlive-infwarerr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn53023"

RPM_NAME = "texlive-infwarerr-doc-2023.209.1.5svn53023-54.1.noarch.rpm"
RPM_HASH = "eb73a8a8f3e51fe975858c7ab11582691a7c8965ebdbf164eecc8bf3d2a2ecb46086e31c0f87e0e6d590cdf5b0e5799328d0360ce0fa76d66bab5b45c2669174"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-infwarerr-doc"

RDEPENDS:${PN} += ""

inherit rpm
