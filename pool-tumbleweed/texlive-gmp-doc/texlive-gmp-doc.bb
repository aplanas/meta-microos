SUMMARY = "Documentation for texlive-gmp"
DESCRIPTION = "This package includes the documentation for texlive-gmp"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21691"

RPM_NAME = "texlive-gmp-doc-2023.201.1.0svn21691-53.2.noarch.rpm"
RPM_HASH = "d5cf45ace39d0b58e0a64d237fc6cb5fd74476b39b859dfed6b57af13b8637566f24389ad0b42989ca4972598508a435339c41eefe4e38a93d65b71848bf6b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
