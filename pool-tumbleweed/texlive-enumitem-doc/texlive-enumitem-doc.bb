SUMMARY = "Documentation for texlive-enumitem"
DESCRIPTION = "This package includes the documentation for texlive-enumitem"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.9svn51423"

RPM_NAME = "texlive-enumitem-doc-2023.209.3.9svn51423-54.1.noarch.rpm"
RPM_HASH = "383fcd1c94075d0649115a346272bc8fa35ad8ce740ffcbd75757d2a0ae37c931823222f7e8d28e43ff5e41d0ff1c24d3e1282548ecfa20717e22a63560f0539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enumitem-doc"

RDEPENDS:${PN} += ""

inherit rpm
