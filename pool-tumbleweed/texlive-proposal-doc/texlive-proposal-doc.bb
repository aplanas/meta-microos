SUMMARY = "Documentation for texlive-proposal"
DESCRIPTION = "This package includes the documentation for texlive-proposal"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn40538"

RPM_NAME = "texlive-proposal-doc-2023.209.svn40538-53.1.noarch.rpm"
RPM_HASH = "9eb26c6c8fda2946439484d483800f97315aee401b437c8d1bddd57efd51cf00d76b7653ed8d5d863927a9b38a24492a93b293ad125d768c7543dae392a97743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-proposal-doc"

RDEPENDS:${PN} += ""

inherit rpm
