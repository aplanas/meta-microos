SUMMARY = "Documentation for texlive-gitinfo2"
DESCRIPTION = "This package includes the documentation for texlive-gitinfo2"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.7svn38913"

RPM_NAME = "texlive-gitinfo2-doc-2023.201.2.0.7svn38913-53.1.noarch.rpm"
RPM_HASH = "7213904d371796d5f744b1a2585b59ba2ec4359bb5a6f4e491f250a249cf841867f35d93fbbc00f4c6005283b69e054cfe3f67967d0f3bb0c1e9076aa2bd6ca1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitinfo2-doc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
