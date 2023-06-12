SUMMARY = "Documentation for texlive-dpfloat"
DESCRIPTION = "This package includes the documentation for texlive-dpfloat"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17196"

RPM_NAME = "texlive-dpfloat-doc-2023.201.svn17196-52.1.noarch.rpm"
RPM_HASH = "0173e3be8024a4fa5ddebca365cda5bd592421bc965460e11031b8bb3d2a5f2b6e3bb36ac1b7d23e90504aa5ec3e2e2f5f6d68b83b4b8c7c904aeb868ddb8bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dpfloat-doc"
RDEPENDS:${PN} += ""

inherit rpm
