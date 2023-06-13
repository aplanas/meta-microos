SUMMARY = "Documentation for texlive-braids"
DESCRIPTION = "This package includes the documentation for texlive-braids"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn64817"

RPM_NAME = "texlive-braids-doc-2023.201.2.2svn64817-52.1.noarch.rpm"
RPM_HASH = "1859226ce2e98584b3ab56b6a23ff4234c805b8a27943e029c20f845186ed928bc3ae0f936a6b56666395e17616f340e4f3a1efd217bf9c3a8e12805e7d2d223"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-braids-doc"

RDEPENDS:${PN} += ""

inherit rpm
