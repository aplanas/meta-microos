SUMMARY = "Documentation for texlive-magaz"
DESCRIPTION = "This package includes the documentation for texlive-magaz"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn24694"

RPM_NAME = "texlive-magaz-doc-2023.201.0.0.4svn24694-52.1.noarch.rpm"
RPM_HASH = "24693040a83c5bcc3654fb990620d974ae6d6203d3576b2675727fb9beee3a6f8a254badc4f8bc2db4621ebc9b70414e17a3a66594df8ee8ebebbbdae74f7582"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-magaz-doc"

RDEPENDS:${PN} += ""

inherit rpm
