SUMMARY = "Documentation for texlive-conteq"
DESCRIPTION = "This package includes the documentation for texlive-conteq"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn37868"

RPM_NAME = "texlive-conteq-doc-2023.209.0.0.1.1svn37868-55.1.noarch.rpm"
RPM_HASH = "59f8a4b0d165c84044894683f0b83cfab7d6fa7caf62aa50463f37cd15f6b123b3b8d123b51211f2a6ddd04b72505773d3c0ae836b7bcbdc78c382f4e39ba0cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-conteq-doc"

RDEPENDS:${PN} += ""

inherit rpm
