SUMMARY = "Documentation for texlive-gitinfo2"
DESCRIPTION = "This package includes the documentation for texlive-gitinfo2"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.7svn38913"

RPM_NAME = "texlive-gitinfo2-doc-2023.201.2.0.7svn38913-53.2.noarch.rpm"
RPM_HASH = "f98a32c3955490d15d28da815ebd358f6a4dc665995080739a22f5f8a3892c59f5d76f3131a2e6e158205acc87fb73948d87cfe8f3bde70d8ee3813aa9b3b5f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitinfo2-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
