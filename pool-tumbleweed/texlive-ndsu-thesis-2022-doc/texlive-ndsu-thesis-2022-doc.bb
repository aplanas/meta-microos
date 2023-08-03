SUMMARY = "Documentation for texlive-ndsu-thesis-2022"
DESCRIPTION = "This package includes the documentation for texlive-ndsu-thesis-2022"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63881"

RPM_NAME = "texlive-ndsu-thesis-2022-doc-2023.209.svn63881-55.1.noarch.rpm"
RPM_HASH = "130e75f12815dc74d2bca14df115b2ba3a630d5eb016bce948609830422830a4b711534992a7a6266574932eeaf0cad7dec77a493d4e269457a37bf40b48a55a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ndsu-thesis-2022-doc"

RDEPENDS:${PN} += ""

inherit rpm
