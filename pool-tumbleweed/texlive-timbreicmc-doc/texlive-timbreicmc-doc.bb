SUMMARY = "Documentation for texlive-timbreicmc"
DESCRIPTION = "This package includes the documentation for texlive-timbreicmc"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn49740"

RPM_NAME = "texlive-timbreicmc-doc-2023.209.2.0svn49740-53.1.noarch.rpm"
RPM_HASH = "48eca758efc2fd8af12c4e008d335272cfc097bdcf9f407c8801ae85b851915f52f41ffdff3aa9dfd7e6d11bdf9b5a85ef6b00375c1ea2b54b70f2da5c571b60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-timbreicmc-doc"

RDEPENDS:${PN} += ""

inherit rpm
