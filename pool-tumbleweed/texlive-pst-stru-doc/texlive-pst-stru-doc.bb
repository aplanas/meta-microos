SUMMARY = "Documentation for texlive-pst-stru"
DESCRIPTION = "This package includes the documentation for texlive-pst-stru"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13svn38613"

RPM_NAME = "texlive-pst-stru-doc-2023.209.0.0.13svn38613-54.1.noarch.rpm"
RPM_HASH = "bfe093f51c443358eaa06f85cfb5cdf0225637b6d6b2f726681fa120c2b0643379ebfd16996aaec4864afddf4cf526cb763128e401f8bf846005772c45aac613"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-stru-doc"

RDEPENDS:${PN} += ""

inherit rpm
