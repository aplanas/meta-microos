SUMMARY = "Documentation for texlive-orcidlink"
DESCRIPTION = "This package includes the documentation for texlive-orcidlink"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.4svn59560"

RPM_NAME = "texlive-orcidlink-doc-2023.201.1.0.4svn59560-54.1.noarch.rpm"
RPM_HASH = "c1eb766c8217dd5b7943cecd457c8e10e18215bec76cb9f23420b351ad2836ddf207067be3ff61ea8cce6b92a5897ab0a9717cd9afc1c1a75ff67ab8699303e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-orcidlink-doc"

RDEPENDS:${PN} += ""

inherit rpm
