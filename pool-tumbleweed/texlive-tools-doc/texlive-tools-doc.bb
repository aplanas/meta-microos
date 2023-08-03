SUMMARY = "Documentation for texlive-tools"
DESCRIPTION = "This package includes the documentation for texlive-tools"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64892"

RPM_NAME = "texlive-tools-doc-2023.209.svn64892-53.1.noarch.rpm"
RPM_HASH = "edd9dae612a43f2fb8c1f5ed9f18fe5ccb33ceb559dceb1249b05f36d9eb9353bca685ba4725383a021ab2a9f4d882a6b24a15119648bcba9961e693ef537377"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
