SUMMARY = "Documentation for texlive-orcidlink"
DESCRIPTION = "This package includes the documentation for texlive-orcidlink"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.4svn59560"

RPM_NAME = "texlive-orcidlink-doc-2023.209.1.0.4svn59560-55.1.noarch.rpm"
RPM_HASH = "55acf4a9f4b36371884e35adafd962ec6fe5e592d6a8efc63b2ec4abad572ad659bddac30d56368d75903a2a9aab4d0444fa726d924d4034e537e870138982c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-orcidlink-doc"

RDEPENDS:${PN} += ""

inherit rpm
