SUMMARY = "Documentation for texlive-titling"
DESCRIPTION = "This package includes the documentation for texlive-titling"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1dsvn15878"

RPM_NAME = "texlive-titling-doc-2023.201.2.1dsvn15878-52.1.noarch.rpm"
RPM_HASH = "39a7676c746ab28785e02e09aa148f274ae99f6704c111b8a819f97147a7507a33ec9e2a05950c2f63ee93e5b751cc7286959ad146e44aa4f62734a9872857aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titling-doc"

RDEPENDS:${PN} += ""

inherit rpm
