SUMMARY = "Documentation for texlive-reledmac"
DESCRIPTION = "This package includes the documentation for texlive-reledmac"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.39.1svn63105"

RPM_NAME = "texlive-reledmac-doc-2023.209.2.39.1svn63105-54.2.noarch.rpm"
RPM_HASH = "72364033d9ffe86f4906a8dc3c1de4f9f91bbeddca77ae49447ee7b2dc8979326098f200fab1f4747b9623553d84ed453697a060b31a61def77b6b0b00d7a97a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reledmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
