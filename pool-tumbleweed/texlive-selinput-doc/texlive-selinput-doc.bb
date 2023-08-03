SUMMARY = "Documentation for texlive-selinput"
DESCRIPTION = "This package includes the documentation for texlive-selinput"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn53098"

RPM_NAME = "texlive-selinput-doc-2023.209.1.6svn53098-54.1.noarch.rpm"
RPM_HASH = "bc66b8afd4c77cae30017b283ae61c448296cb8fc15c8a4111fe14a691296e018f0662fda0da81f7a7ea5c318f3e851570fa5dde79e8c62630351b0923c0f280"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-selinput-doc"

RDEPENDS:${PN} += ""

inherit rpm
