SUMMARY = "Documentation for texlive-ellipsis"
DESCRIPTION = "This package includes the documentation for texlive-ellipsis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn55418"

RPM_NAME = "texlive-ellipsis-doc-2023.201.1.8svn55418-53.1.noarch.rpm"
RPM_HASH = "cabcee35ac1e79f50f364a97c098413986c0855df36193fc1f97968c3aa7e6a6695d1ef1bea302e98e116f84752a7a19b6f6f447d29e8caa0799c03dec74a30d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ellipsis-doc"

RDEPENDS:${PN} += ""

inherit rpm
