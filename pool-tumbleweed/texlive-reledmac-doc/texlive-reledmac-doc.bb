SUMMARY = "Documentation for texlive-reledmac"
DESCRIPTION = "This package includes the documentation for texlive-reledmac"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.39.1svn63105"

RPM_NAME = "texlive-reledmac-doc-2023.209.2.39.1svn63105-54.1.noarch.rpm"
RPM_HASH = "231ada3fde99603ece9743dffcee301424ddfad8d1788dcac6e33fb015165fb7fe25abd6d898926cc903c6d8d1ecd04849ba5eeeb75f9e810a2c46a3ba5352cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reledmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
