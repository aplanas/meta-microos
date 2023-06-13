SUMMARY = "Documentation for texlive-begingreek"
DESCRIPTION = "This package includes the documentation for texlive-begingreek"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn63255"

RPM_NAME = "texlive-begingreek-doc-2023.201.1.7svn63255-53.1.noarch.rpm"
RPM_HASH = "c93d8843f724ce1d25ee4270bcd24c147c25055ca7029e7f6398be3c1a04b1c3a5f8f133e2f4b9763245364ddc09f1eda457ff12d6960688ba17615f8198d550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-begingreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
