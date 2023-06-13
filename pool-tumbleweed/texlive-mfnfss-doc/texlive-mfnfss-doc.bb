SUMMARY = "Documentation for texlive-mfnfss"
DESCRIPTION = "This package includes the documentation for texlive-mfnfss"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn46036"

RPM_NAME = "texlive-mfnfss-doc-2023.201.svn46036-54.1.noarch.rpm"
RPM_HASH = "92b4f156253379c7a67e6f08f84ec45892dd1541d9ca0019423a2a1b3b329e644ba4f7e2e020a90073bec9efd9d46f5f32d3db226d91cfd3881e07b3d681c264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mfnfss-doc"

RDEPENDS:${PN} += ""

inherit rpm
