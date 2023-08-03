SUMMARY = "Documentation for texlive-ghsystem"
DESCRIPTION = "This package includes the documentation for texlive-ghsystem"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.8csvn53822"

RPM_NAME = "texlive-ghsystem-doc-2023.209.4.8csvn53822-53.1.noarch.rpm"
RPM_HASH = "1aa1dde96f2eec1f821001933608d7cbd508ca4497fe8d6bef321c2996500c1c91ba4339c483f8c4d0cd3cdb00f77cd5248abaa585a08902e87ed20c157cc0d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ghsystem-doc"

RDEPENDS:${PN} += ""

inherit rpm
