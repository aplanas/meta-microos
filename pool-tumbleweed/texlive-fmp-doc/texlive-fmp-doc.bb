SUMMARY = "Documentation for texlive-fmp"
DESCRIPTION = "This package includes the documentation for texlive-fmp"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-fmp-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "6d5d80dc5339f441ec8e321b54dd7c21389c28cfe00f6def6b6e35b756c2a74c3c807e99e5ffc04d041c2e971e394aa0e528f9b9dc66af1624c306c76f688876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
