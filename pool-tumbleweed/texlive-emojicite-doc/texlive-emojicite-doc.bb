SUMMARY = "Documentation for texlive-emojicite"
DESCRIPTION = "This package includes the documentation for texlive-emojicite"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn55131"

RPM_NAME = "texlive-emojicite-doc-2023.201.0.0.3svn55131-53.1.noarch.rpm"
RPM_HASH = "68d2a8cf788e176867081307d7eaaf0c4d9dcaa64eb98fb63d29c26cf6390bfd28336bd2f66c226e1b569a03267cdddc8170446e985f64fe104bd47c63888a52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emojicite-doc"

RDEPENDS:${PN} += ""

inherit rpm
