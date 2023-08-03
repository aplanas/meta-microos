SUMMARY = "Documentation for texlive-polynom"
DESCRIPTION = "This package includes the documentation for texlive-polynom"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.19svn44832"

RPM_NAME = "texlive-polynom-doc-2023.209.0.0.19svn44832-53.1.noarch.rpm"
RPM_HASH = "487e6244e3d5e8011756f05753c5ec3f2a7ae4ff977154b99012349b80d21f6cf5b8c5c9a4187987dc46ec22a7f710db8039424048951336e4c8f08f14397fd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-polynom-doc"

RDEPENDS:${PN} += ""

inherit rpm
