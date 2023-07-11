SUMMARY = "Documentation for texlive-ehhline"
DESCRIPTION = "This package includes the documentation for texlive-ehhline"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn54676"

RPM_NAME = "texlive-ehhline-doc-2023.201.1.1svn54676-53.2.noarch.rpm"
RPM_HASH = "24435c27384b7f92a41f2afeb739e6d1a428bcc997473d34f458e92cec7ba0b583f719dea7fe462083581a098cba3da03891009248ce52ebdccd46f13e777357"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ehhline-doc"

RDEPENDS:${PN} += ""

inherit rpm
