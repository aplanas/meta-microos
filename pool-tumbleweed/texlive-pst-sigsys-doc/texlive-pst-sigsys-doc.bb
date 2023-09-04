SUMMARY = "Documentation for texlive-pst-sigsys"
DESCRIPTION = "This package includes the documentation for texlive-pst-sigsys"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn21667"

RPM_NAME = "texlive-pst-sigsys-doc-2023.209.1.4svn21667-54.2.noarch.rpm"
RPM_HASH = "aa4a95c3dde93fc9bd5a346866c8d00a25979e68358d8941c1713fa823f21a59aa33043215fb9ebb8325c0e88066deb905e62207488d193d91c1c3893b413d0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-sigsys-doc"

RDEPENDS:${PN} += ""

inherit rpm
