SUMMARY = "Documentation for texlive-cdcmd"
DESCRIPTION = "This package includes the documentation for texlive-cdcmd"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn60742"

RPM_NAME = "texlive-cdcmd-doc-2023.201.1.0svn60742-52.1.noarch.rpm"
RPM_HASH = "5386a09b2580ca66baf08fb266ff5d6c549b43c1d8767b7e9b5f0c34ea80e90fd10764fcddb34308bcb9b94cac3314a559859339cdfa09dd3d3d6e9edd2f0e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-cdcmd-doc:zh) \
texlive-cdcmd-doc"

RDEPENDS:${PN} += ""

inherit rpm
