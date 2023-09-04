SUMMARY = "Documentation for texlive-histogr"
DESCRIPTION = "This package includes the documentation for texlive-histogr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn15878"

RPM_NAME = "texlive-histogr-doc-2023.209.1.01svn15878-54.2.noarch.rpm"
RPM_HASH = "b83b412b36e5e9c120ae4eb6ecb9540853bf21ec1e62bb3dfa28a0da98ee667d12c33fa5ff83349c484ce38350bc4ead68909f8e30d1076f5d7634749814f84e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-histogr-doc"

RDEPENDS:${PN} += ""

inherit rpm
