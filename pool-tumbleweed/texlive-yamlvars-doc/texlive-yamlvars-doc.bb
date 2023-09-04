SUMMARY = "Documentation for texlive-yamlvars"
DESCRIPTION = "This package includes the documentation for texlive-yamlvars"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64949"

RPM_NAME = "texlive-yamlvars-doc-2023.209.svn64949-53.2.noarch.rpm"
RPM_HASH = "a6c9de07f2905c773e429ddba7d29cd639287955f2323614233030449e2fb2171eba34ecc9a1b1494f6fc70d99c9131d6ff7940e214a63dd5fd5e5139e5bd710"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yamlvars-doc"

RDEPENDS:${PN} += ""

inherit rpm
