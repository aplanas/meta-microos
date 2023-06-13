SUMMARY = "Documentation for texlive-eq-pin2corr"
DESCRIPTION = "This package includes the documentation for texlive-eq-pin2corr"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59477"

RPM_NAME = "texlive-eq-pin2corr-doc-2023.201.svn59477-53.1.noarch.rpm"
RPM_HASH = "90011b503f9b2278faf58fa186236a8835e9c316410745528c71960bf24b6e4000cd0ca8982756e8f22d400cc5d01858135cbc4a61e58126f74b3f9d4f82c413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eq-pin2corr-doc"

RDEPENDS:${PN} += ""

inherit rpm
