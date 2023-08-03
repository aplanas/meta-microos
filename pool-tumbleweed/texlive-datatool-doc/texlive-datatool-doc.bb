SUMMARY = "Documentation for texlive-datatool"
DESCRIPTION = "This package includes the documentation for texlive-datatool"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.32svn52663"

RPM_NAME = "texlive-datatool-doc-2023.209.2.32svn52663-55.1.noarch.rpm"
RPM_HASH = "69ccc410460944c06f05627f0c2c111f45b6db0cd51c7f4f061f990980020498b61232769dce7488b7de6330e77f438a5d165e9ea3b1a436581cfe100ea76c09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datatool-doc"

RDEPENDS:${PN} += ""

inherit rpm
