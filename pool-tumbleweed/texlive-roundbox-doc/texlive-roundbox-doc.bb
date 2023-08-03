SUMMARY = "Documentation for texlive-roundbox"
DESCRIPTION = "This package includes the documentation for texlive-roundbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn29675"

RPM_NAME = "texlive-roundbox-doc-2023.209.0.0.2svn29675-54.1.noarch.rpm"
RPM_HASH = "e7c78074cbbf7d9f442494266a5d7fa9b2413ec2bd14943e211423e95a4bf109ee34e3346afd3bfb93c1c8f47b5e6296c871ddcd76780d4d718f3d7c7eb15e53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-roundbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
