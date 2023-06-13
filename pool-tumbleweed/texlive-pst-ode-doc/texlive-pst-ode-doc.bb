SUMMARY = "Documentation for texlive-pst-ode"
DESCRIPTION = "This package includes the documentation for texlive-pst-ode"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.18svn65096"

RPM_NAME = "texlive-pst-ode-doc-2023.201.0.0.18svn65096-52.1.noarch.rpm"
RPM_HASH = "893b623a301d01db621121d7ab07a5028f1128ce98296845bec4773bc664925cbbf8a4b22d8e791f89f7375d4c8b53f2c5145afb3adb01bb92d7b5db04d3dbc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-ode-doc"

RDEPENDS:${PN} += ""

inherit rpm
