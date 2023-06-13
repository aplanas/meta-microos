SUMMARY = "Documentation for texlive-cmpj"
DESCRIPTION = "This package includes the documentation for texlive-cmpj"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.03svn58506"

RPM_NAME = "texlive-cmpj-doc-2023.201.3.03svn58506-53.1.noarch.rpm"
RPM_HASH = "3ccace03388b901ec3435ad46027ecf0bda34cbf7d148daaf57ea3dac9afcbb9bda893c85d5ebfea8a6a99f7123aec29c62964fd46c01fda859811a29ae1fb63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmpj-doc"

RDEPENDS:${PN} += ""

inherit rpm
