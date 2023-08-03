SUMMARY = "Documentation for texlive-xcolor"
DESCRIPTION = "This package includes the documentation for texlive-xcolor"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.14svn63563"

RPM_NAME = "texlive-xcolor-doc-2023.209.2.14svn63563-53.1.noarch.rpm"
RPM_HASH = "78a79b9d19d4b3229fd4f67693dec1612e4653bd608cf8219a23fbe527c18158d7aa6bfd84ec29f29392547a403696d7e6bc8107c15146ae934c84155d7adf0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
