SUMMARY = "Documentation for texlive-threeparttablex"
DESCRIPTION = "This package includes the documentation for texlive-threeparttablex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn34206"

RPM_NAME = "texlive-threeparttablex-doc-2023.201.0.0.3svn34206-54.1.noarch.rpm"
RPM_HASH = "bd281b5262e6125b762a41ea61840e6158903e746dbd10e93781080e38ae8be0982f0f8f11276f1d653f3fbe9874fda093f3bbdbaff07390669e6b315ebce4f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-threeparttablex-doc"

RDEPENDS:${PN} += ""

inherit rpm
