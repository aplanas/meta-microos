SUMMARY = "Documentation for texlive-europecv"
DESCRIPTION = "This package includes the documentation for texlive-europecv"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64037"

RPM_NAME = "texlive-europecv-doc-2023.209.svn64037-53.1.noarch.rpm"
RPM_HASH = "54132e5e0d35be288a0d4ca77cbf8ad87a8cc72652ffcd22a9f434c6ee0ad93b40c432baa1be83d875b10e2fc7d5dc7494401c47d71ece53df13bd666d1a7912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-europecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
