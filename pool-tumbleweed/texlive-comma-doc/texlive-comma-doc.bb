SUMMARY = "Documentation for texlive-comma"
DESCRIPTION = "This package includes the documentation for texlive-comma"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn18259"

RPM_NAME = "texlive-comma-doc-2023.209.1.2svn18259-54.1.noarch.rpm"
RPM_HASH = "c3fff5f5506b65b09ab8d6d50b31186c4c373de47ef90136f7a472eac46e5d0b48e1b91ff7cfdb78afc61645b6cca68f2ebb8f955f0dc2520b914fe75edcad31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-comma-doc"

RDEPENDS:${PN} += ""

inherit rpm
