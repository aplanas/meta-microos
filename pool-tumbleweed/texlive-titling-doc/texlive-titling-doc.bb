SUMMARY = "Documentation for texlive-titling"
DESCRIPTION = "This package includes the documentation for texlive-titling"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1dsvn15878"

RPM_NAME = "texlive-titling-doc-2023.209.2.1dsvn15878-53.1.noarch.rpm"
RPM_HASH = "d8852084134dc85bd6334af2757ca16c57e2ad065c63d9ac08ac01956f62b67c3ae555a3a38ba14a594bd7b9c8fc6925698db06032edf1d24483d8f21d0200ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titling-doc"

RDEPENDS:${PN} += ""

inherit rpm
