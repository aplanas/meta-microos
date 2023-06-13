SUMMARY = "Documentation for texlive-babel-icelandic"
DESCRIPTION = "This package includes the documentation for texlive-babel-icelandic"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn51551"

RPM_NAME = "texlive-babel-icelandic-doc-2023.201.1.3svn51551-53.1.noarch.rpm"
RPM_HASH = "4558bb6c7e7d4c3fb2d78c25681f79b10ff7d865caa5149020cf03fe16c050fd41caa755bcf4b25078e24ffa8d6f9475351bff8081df2caf6eca3135aa901c9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-icelandic-doc"

RDEPENDS:${PN} += ""

inherit rpm
