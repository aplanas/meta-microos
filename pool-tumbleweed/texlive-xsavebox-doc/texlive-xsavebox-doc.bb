SUMMARY = "Documentation for texlive-xsavebox"
DESCRIPTION = "This package includes the documentation for texlive-xsavebox"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.18svn64049"

RPM_NAME = "texlive-xsavebox-doc-2023.209.0.0.18svn64049-53.1.noarch.rpm"
RPM_HASH = "194955897776931ff1a66572e7fba0fffbbcbda05f2bea9fdf8e349c2aa1d84b2e32f8547e4ec59da8624d20448d3541e5713b01dbced25ad8d579637f8e298b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xsavebox-doc"

RDEPENDS:${PN} += ""

inherit rpm
