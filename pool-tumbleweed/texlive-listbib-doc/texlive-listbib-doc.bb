SUMMARY = "Documentation for texlive-listbib"
DESCRIPTION = "This package includes the documentation for texlive-listbib"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.2svn29349"

RPM_NAME = "texlive-listbib-doc-2023.201.2.2svn29349-54.1.noarch.rpm"
RPM_HASH = "70af7145618dcb92dd5a1708222dd28d4b380620d1b4c0f3583e39fb1c4617e23873665be4202822c42372690381fc43ec3b8dcac1bd6f45c16808f04f8dff06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listbib-doc"
RDEPENDS:${PN} += ""

inherit rpm
