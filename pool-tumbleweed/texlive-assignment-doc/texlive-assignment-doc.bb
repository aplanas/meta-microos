SUMMARY = "Documentation for texlive-assignment"
DESCRIPTION = "This package includes the documentation for texlive-assignment"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20431"

RPM_NAME = "texlive-assignment-doc-2023.201.svn20431-53.1.noarch.rpm"
RPM_HASH = "39d0f4ebd78dd537187932c6e96eb483469a7ee6aaefb055d378f92a02db4f03852a5d6e6e659684b564d31b72e78e85cb36855e70ed32522baa77f8d04dbc14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-assignment-doc"
RDEPENDS:${PN} += ""

inherit rpm
