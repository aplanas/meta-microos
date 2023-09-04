SUMMARY = "Documentation for texlive-epspdfconversion"
DESCRIPTION = "This package includes the documentation for texlive-epspdfconversion"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.61svn18703"

RPM_NAME = "texlive-epspdfconversion-doc-2023.209.0.0.61svn18703-54.2.noarch.rpm"
RPM_HASH = "ade5309e5b56831d866680b200c1af1a6161464d0cdf068e16b9238ab52e9b5ff775ec8c45714ba7550f1a6c0f0ac477207aba93d338325dd64965e8ebd9728f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epspdfconversion-doc"

RDEPENDS:${PN} += ""

inherit rpm
