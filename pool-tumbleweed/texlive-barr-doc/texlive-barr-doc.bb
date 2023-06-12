SUMMARY = "Documentation for texlive-barr"
DESCRIPTION = "This package includes the documentation for texlive-barr"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn38479"

RPM_NAME = "texlive-barr-doc-2023.201.svn38479-53.1.noarch.rpm"
RPM_HASH = "6deb29150a3a230af2c7959245410cef7c19f386208ab8116930c9ba4b53b8d45437550eee1e37f8ab060434e32b196a3af25b13f4330912c4498f20d5a0b6e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-barr-doc"
RDEPENDS:${PN} += ""

inherit rpm
