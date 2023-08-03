SUMMARY = "Documentation for texlive-collref"
DESCRIPTION = "This package includes the documentation for texlive-collref"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0csvn46358"

RPM_NAME = "texlive-collref-doc-2023.209.2.0csvn46358-54.1.noarch.rpm"
RPM_HASH = "7d943f8b3a20de610d1a34a3fd54253d380d3604d2127ca25e8c9d8afa16d0f2c81211bfab615f1313180652f2907613fd9558b2f9ad7ea210ba302dd7a7e2d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collref-doc"

RDEPENDS:${PN} += ""

inherit rpm
