SUMMARY = "Documentation for texlive-graphpaper"
DESCRIPTION = "This package includes the documentation for texlive-graphpaper"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn63116"

RPM_NAME = "texlive-graphpaper-doc-2023.201.1.1svn63116-53.2.noarch.rpm"
RPM_HASH = "559511435b793b7294f5a621d2729deeb7896f465ab06eff1e3851072e75023d719ae4adf147e5ca1b6b5f3ded36ba691ae2f0fc5a08ee862d80f3bce547e127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphpaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
