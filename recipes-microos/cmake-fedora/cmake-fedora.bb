SUMMARY = "CMake modules and scripts"
DESCRIPTION = "cmake-fedora consists a set of scripts and cmake modules that simply the \
release process of a *nix software package,  especially for \
Fedora and EPEL."
LICENSE = "BSD-3-Clause"

PV = "2.9.3"

RPM_NAME = "cmake-fedora-2.9.3-1.9.noarch.rpm"
RPM_HASH = "be04353cf88030ad125bc5dce9039992018f6d41d5c8348fa72cad96e2581170a6ea550baa407a843fec62e21b9dddd1604faea2baf06f3065615931603e5b06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-fedora config(cmake-fedora)"
RDEPENDS:${PN} += "/bin/bash /bin/sh"

inherit rpm
