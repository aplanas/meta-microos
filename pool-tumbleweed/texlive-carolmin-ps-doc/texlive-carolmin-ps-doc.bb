SUMMARY = "Documentation for texlive-carolmin-ps"
DESCRIPTION = "This package includes the documentation for texlive-carolmin-ps"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-carolmin-ps-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "be38bea11b3476d14d4a22728d8ff951897ad491f2280ed2df9ae56dcf380888bc479d2541ce69b8da02d07bea7461162d28969aff01ff36cc4750a454facdc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-carolmin-ps-doc"
RDEPENDS:${PN} += ""

inherit rpm
