SUMMARY = "Documentation for texlive-apacite"
DESCRIPTION = "This package includes the documentation for texlive-apacite"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.03svn54080"

RPM_NAME = "texlive-apacite-doc-2023.201.6.03svn54080-54.1.noarch.rpm"
RPM_HASH = "2b20cec97244ac1738cf0d6dba03a4bd059c1a54bbeeecd6ea4b4d0136c80c062bb9908f0c661ecd4f587ce660b7969a15e8b911f30da0162f0598065f130158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apacite-doc"

RDEPENDS:${PN} += ""

inherit rpm
