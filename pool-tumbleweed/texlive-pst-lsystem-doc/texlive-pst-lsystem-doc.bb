SUMMARY = "Documentation for texlive-pst-lsystem"
DESCRIPTION = "This package includes the documentation for texlive-pst-lsystem"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn49556"

RPM_NAME = "texlive-pst-lsystem-doc-2023.209.0.0.02svn49556-53.1.noarch.rpm"
RPM_HASH = "9b5289a724c620cbe68b71e3f210143cb31ece305367689c50b0073cbdbef2ae1cd7e2348f9b197bf69ddc6bc7a948896d13900b4ff166e11f54b6735dc2e9e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-lsystem-doc"

RDEPENDS:${PN} += ""

inherit rpm
