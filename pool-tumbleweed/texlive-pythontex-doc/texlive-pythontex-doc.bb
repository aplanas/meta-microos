SUMMARY = "Documentation for texlive-pythontex"
DESCRIPTION = "This package includes the documentation for texlive-pythontex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.18svn59514"

RPM_NAME = "texlive-pythontex-doc-2023.209.0.0.18svn59514-54.1.noarch.rpm"
RPM_HASH = "bae41b04349044d011047da10d07759756d67e208b4b2e3d0976e892c96c91509e4b9fc03bf8e0c67f950ec68f199579aa1e5624ffa07512a2dd90c5992fb566"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pythontex-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
