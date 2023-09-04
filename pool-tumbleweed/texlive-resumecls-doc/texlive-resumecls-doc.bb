SUMMARY = "Documentation for texlive-resumecls"
DESCRIPTION = "This package includes the documentation for texlive-resumecls"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.1svn54815"

RPM_NAME = "texlive-resumecls-doc-2023.209.0.0.4.1svn54815-54.2.noarch.rpm"
RPM_HASH = "12ae8a6734a0e46c90038d7baa8d982ecd5dc04c4f8690be43d76818cd9bf01679de057a99fcf41eb3aa87baeb76c952a703da5517e00258c604450d9b400d75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resumecls-doc"

RDEPENDS:${PN} += ""

inherit rpm
