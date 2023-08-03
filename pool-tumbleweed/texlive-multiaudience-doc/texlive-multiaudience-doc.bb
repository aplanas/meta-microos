SUMMARY = "Documentation for texlive-multiaudience"
DESCRIPTION = "This package includes the documentation for texlive-multiaudience"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.04svn60688"

RPM_NAME = "texlive-multiaudience-doc-2023.209.1.04svn60688-55.1.noarch.rpm"
RPM_HASH = "c16941407f2a1ca0c639ece66cbed6a32a2575a2c82245df64bc8c037a94787ca7f5a81cc2550e82245e9f62e04690443fb57342627b4b8e0854b51d9231a5ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multiaudience-doc"

RDEPENDS:${PN} += ""

inherit rpm
