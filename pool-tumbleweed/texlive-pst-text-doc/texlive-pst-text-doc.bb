SUMMARY = "Documentation for texlive-pst-text"
DESCRIPTION = "This package includes the documentation for texlive-pst-text"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn49542"

RPM_NAME = "texlive-pst-text-doc-2023.201.1.02svn49542-53.2.noarch.rpm"
RPM_HASH = "71fab3a7b648bf3f045f604d7fc5b56d143b7c55e77280e6c1f8c9d94e3dd3284991f30b64ea6c25a1e9342d220f63022e065be448404a0b981ff320a68c9334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-text-doc"

RDEPENDS:${PN} += ""

inherit rpm
