SUMMARY = "Documentation for texlive-context-french"
DESCRIPTION = "This package includes the documentation for texlive-context-french"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn54215"

RPM_NAME = "texlive-context-french-doc-2023.209.svn54215-55.1.noarch.rpm"
RPM_HASH = "abb9c89324d13c28c429c9bd08fd5f5cbbaea253e6bdcd2bf1f5eea4cc3a0de5974068023253958ed6566741bc3e69c5c1a23a0c6344212b3b2cfa4c2dae1243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-french-doc"

RDEPENDS:${PN} += ""

inherit rpm
