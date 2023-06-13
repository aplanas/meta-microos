SUMMARY = "Documentation for texlive-epsdice"
DESCRIPTION = "This package includes the documentation for texlive-epsdice"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn15878"

RPM_NAME = "texlive-epsdice-doc-2023.201.2.1svn15878-53.1.noarch.rpm"
RPM_HASH = "975b45a0d84aa69688e69ef245528447aca01379544f58e82dfd90ad56b0e2edd26419dd137486dd5a5cdc9b853a8b9ba1604f985f6d675323ddb104f9c7e0c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsdice-doc"

RDEPENDS:${PN} += ""

inherit rpm
