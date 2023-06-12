SUMMARY = "Documentation for texlive-multifootnote"
DESCRIPTION = "This package includes the documentation for texlive-multifootnote"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63456"

RPM_NAME = "texlive-multifootnote-doc-2023.201.svn63456-54.1.noarch.rpm"
RPM_HASH = "96b5600fbe00521261392f47b9ad46e74b51057e8fdb392745550b4869cd49e64372f8c631de27cc83b82a264e0f7279ffa476f0e7ccb0daffdc17278702eaed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multifootnote-doc"
RDEPENDS:${PN} += ""

inherit rpm
