SUMMARY = "Documentation for texlive-endheads"
DESCRIPTION = "This package includes the documentation for texlive-endheads"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn43750"

RPM_NAME = "texlive-endheads-doc-2023.201.1.6svn43750-53.2.noarch.rpm"
RPM_HASH = "9ac6d1580cc9da4c81cf1defe09699beb075f474971ab1809a2ae31dcfd585a78b1ec1154c776191683e2154288734d56235d06864f4ec1a005ebb422bbce607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endheads-doc"

RDEPENDS:${PN} += ""

inherit rpm
