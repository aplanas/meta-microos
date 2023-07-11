SUMMARY = "Documentation for texlive-environ"
DESCRIPTION = "This package includes the documentation for texlive-environ"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn56615"

RPM_NAME = "texlive-environ-doc-2023.201.0.0.3svn56615-53.2.noarch.rpm"
RPM_HASH = "102aba558e546e2d66638d3f6bc542e9ecc57c1c2e2c797f7081a09605a7f6157e4456a1f6bde1a5884997353c19d0a6912e8530de5e6d28e9f768ff91eee95c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-environ-doc"

RDEPENDS:${PN} += ""

inherit rpm
