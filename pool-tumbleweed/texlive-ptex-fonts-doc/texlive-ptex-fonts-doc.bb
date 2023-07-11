SUMMARY = "Documentation for texlive-ptex-fonts"
DESCRIPTION = "This package includes the documentation for texlive-ptex-fonts"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn64330"

RPM_NAME = "texlive-ptex-fonts-doc-2023.201.svn64330-53.2.noarch.rpm"
RPM_HASH = "b85b3fdf0d29ac51e5860a5ec334c320ff16bef982b331a998f899b69063ce0b6f697a0c030758e79411a1e130bdc6e6d16c280cc9a34243d461f8a7382263c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
