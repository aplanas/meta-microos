SUMMARY = "Documentation for texlive-slantsc"
DESCRIPTION = "This package includes the documentation for texlive-slantsc"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.11svn25007"

RPM_NAME = "texlive-slantsc-doc-2023.201.2.11svn25007-57.1.noarch.rpm"
RPM_HASH = "e11ff7fb5ac5259617e2d461de257275db0ebe1e7ce8d398642543b7c94a70d36ebae3839a97d6aa6d0ec9d3ab551d9ac326a8acdf4391f2c10cbaeddff5edbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-slantsc-doc"
RDEPENDS:${PN} += ""

inherit rpm
