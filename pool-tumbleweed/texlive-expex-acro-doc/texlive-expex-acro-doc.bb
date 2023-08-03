SUMMARY = "Documentation for texlive-expex-acro"
DESCRIPTION = "This package includes the documentation for texlive-expex-acro"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.2svn63319"

RPM_NAME = "texlive-expex-acro-doc-2023.209.0.0.0.2svn63319-53.1.noarch.rpm"
RPM_HASH = "de2940d67ae4b06cb9cf422326aabfcdc5f7df357e9e57e978b4e1fb37539f97d5fec23a9dd0614d6a3222c60debde3a12f673a5edbcf36c619d59e992c89546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expex-acro-doc"

RDEPENDS:${PN} += ""

inherit rpm
