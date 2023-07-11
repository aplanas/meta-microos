SUMMARY = "Documentation for texlive-pst-tools"
DESCRIPTION = "This package includes the documentation for texlive-pst-tools"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.12svn60621"

RPM_NAME = "texlive-pst-tools-doc-2023.201.0.0.12svn60621-53.2.noarch.rpm"
RPM_HASH = "ad00cee77615eef69a60325a55f0589627668cb8b83a9a47f223ea2ba550d52753ad8f19e21e7416b485ed7159aa1d52ba8dac0b70957b101056a906d7b53973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
