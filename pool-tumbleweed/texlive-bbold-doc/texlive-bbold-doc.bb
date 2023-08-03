SUMMARY = "Documentation for texlive-bbold"
DESCRIPTION = "This package includes the documentation for texlive-bbold"
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.01svn17187"

RPM_NAME = "texlive-bbold-doc-2023.209.1.01svn17187-54.1.noarch.rpm"
RPM_HASH = "2cf448a2c5ff7c79009a80ee2bd9a0c5bd718ad044f5639a559028c57ea977b71795970eef2603865719f6dda797e4d75dd95a59c5686f97d34d3093448626e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbold-doc"

RDEPENDS:${PN} += ""

inherit rpm
