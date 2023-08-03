SUMMARY = "Documentation for texlive-zhlineskip"
DESCRIPTION = "This package includes the documentation for texlive-zhlineskip"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0esvn51142"

RPM_NAME = "texlive-zhlineskip-doc-2023.209.1.0esvn51142-53.1.noarch.rpm"
RPM_HASH = "836ff1a86b3f4ca44a9948d5fd1e07d8dd93c65fa1361e6be5803c42f0e1d98616d8086e79dc1f13c948ec20650ca77ce28c317d1c4490dbbf78d5a914669db5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zhlineskip-doc-zh \
texlive-zhlineskip-doc"

RDEPENDS:${PN} += ""

inherit rpm
