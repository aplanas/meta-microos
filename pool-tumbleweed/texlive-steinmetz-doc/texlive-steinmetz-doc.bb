SUMMARY = "Documentation for texlive-steinmetz"
DESCRIPTION = "This package includes the documentation for texlive-steinmetz"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-steinmetz-doc-2023.201.1.0svn15878-57.1.noarch.rpm"
RPM_HASH = "4a6104973bfb3758cab9269e9945e6e709d9baee1935c3f1f2ff687835543c6a2c74cf46dddfadcd4efc251d4f3e3448404ba99d02e90c000dc85e163578d8a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-steinmetz-doc"
RDEPENDS:${PN} += ""

inherit rpm
