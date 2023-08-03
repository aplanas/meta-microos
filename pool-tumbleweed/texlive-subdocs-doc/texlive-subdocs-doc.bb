SUMMARY = "Documentation for texlive-subdocs"
DESCRIPTION = "This package includes the documentation for texlive-subdocs"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn51480"

RPM_NAME = "texlive-subdocs-doc-2023.209.0.0.1svn51480-58.1.noarch.rpm"
RPM_HASH = "1f65bff73bd2e62b8774622b23487cb892196d5ca57f67087934a04030e3914bf38f1d03d6ed33e1b4d7533563502eb40805486ba2e7f1af25568559c900eb70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subdocs-doc"

RDEPENDS:${PN} += ""

inherit rpm
