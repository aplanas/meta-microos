SUMMARY = "Documentation for texlive-pgfgantt"
DESCRIPTION = "This package includes the documentation for texlive-pgfgantt"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.0svn52662"

RPM_NAME = "texlive-pgfgantt-doc-2023.201.5.0svn52662-51.1.noarch.rpm"
RPM_HASH = "c30cf04d80b4bf5e1e1ac452a370cd31df4ea5caf26f9c77ab38201927b544e17ed06f48bc8d1e42d6825a035129b2e5b48da04b3085df9047be8b8bee8f773a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfgantt-doc"

RDEPENDS:${PN} += ""

inherit rpm
