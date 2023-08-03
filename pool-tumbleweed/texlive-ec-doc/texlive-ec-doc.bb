SUMMARY = "Documentation for texlive-ec"
DESCRIPTION = "This package includes the documentation for texlive-ec"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn25033"

RPM_NAME = "texlive-ec-doc-2023.209.1.0svn25033-54.1.noarch.rpm"
RPM_HASH = "66f7d99dbe43b30d8d3198c96f76540b090dc4ad27a33e7b49fd800a4be4040d7778044b17cadbe0d696a64c2ac09686f43a722dbd66eb0040ccf8e6ca7681b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ec-doc"

RDEPENDS:${PN} += ""

inherit rpm
