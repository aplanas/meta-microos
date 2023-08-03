SUMMARY = "Documentation for texlive-hep-acronym"
DESCRIPTION = "This package includes the documentation for texlive-hep-acronym"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64890"

RPM_NAME = "texlive-hep-acronym-doc-2023.209.1.1svn64890-54.1.noarch.rpm"
RPM_HASH = "376ba590c83ebf1021e9c0091b8d67aba82bc94630fe7768086ce1f6b3c4ae23522148fd3de15315b4f6cad6ba7c02a78bee92165ac8622a4a1320aeeb414ec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-acronym-doc"

RDEPENDS:${PN} += ""

inherit rpm
