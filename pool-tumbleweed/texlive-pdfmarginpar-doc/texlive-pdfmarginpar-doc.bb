SUMMARY = "Documentation for texlive-pdfmarginpar"
DESCRIPTION = "This package includes the documentation for texlive-pdfmarginpar"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.92svn23492"

RPM_NAME = "texlive-pdfmarginpar-doc-2023.201.0.0.92svn23492-51.1.noarch.rpm"
RPM_HASH = "cb206524d1329d4c459d880e834c4a710b4e066df8edc565a3869130e8846fcea5ddc602f3777136b62a2241b5c6f447ade3511d0ed2adb69c9ad0fe5aaa0107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfmarginpar-doc"

RDEPENDS:${PN} += ""

inherit rpm
