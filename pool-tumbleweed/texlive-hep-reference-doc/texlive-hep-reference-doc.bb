SUMMARY = "Documentation for texlive-hep-reference"
DESCRIPTION = "This package includes the documentation for texlive-hep-reference"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64853"

RPM_NAME = "texlive-hep-reference-doc-2023.209.1.1svn64853-54.1.noarch.rpm"
RPM_HASH = "7555e051955122115096ddfc5d4055679ae688ccf9d49826967ece1ea0e7e76a40e9b6b9f84fc4eab166419894f636ecd5f73ab83a4f0a12bfa43ac1f85d2f27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-reference-doc"

RDEPENDS:${PN} += ""

inherit rpm
