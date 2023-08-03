SUMMARY = "Documentation for texlive-prtec"
DESCRIPTION = "This package includes the documentation for texlive-prtec"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn51919"

RPM_NAME = "texlive-prtec-doc-2023.209.1.06svn51919-53.1.noarch.rpm"
RPM_HASH = "cac168b66bc42ee37d372f9e9a182cdd617dd8bac0323e6cb7f79daeee46fa3ff9d21d5a79e478f95f143e6035cc1fcdf32704163b160260467c3edc35c30783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prtec-doc"

RDEPENDS:${PN} += ""

inherit rpm
