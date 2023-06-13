SUMMARY = "Documentation for texlive-ecclesiastic"
DESCRIPTION = "This package includes the documentation for texlive-ecclesiastic"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn38172"

RPM_NAME = "texlive-ecclesiastic-doc-2023.201.0.0.3svn38172-53.1.noarch.rpm"
RPM_HASH = "31232f03a9b51954a8b244b3fcf8fdfec5b18396a83ffb134a1ec19810ab24842e1e7d53c38fb6cf97c42458c534380e1ddd142d1da100e3d78d12fa967550f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecclesiastic-doc"

RDEPENDS:${PN} += ""

inherit rpm
