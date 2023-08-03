SUMMARY = "Documentation for texlive-miama"
DESCRIPTION = "This package includes the documentation for texlive-miama"
LICENSE = "OFL-1.1"

PV = "2023.209.1.1svn54512"

RPM_NAME = "texlive-miama-doc-2023.209.1.1svn54512-55.1.noarch.rpm"
RPM_HASH = "955268c9de0dbf8dabf6a5a1670cdb3e9a5591b4266a6ad933fa15ef23b69ceaa0d3f3da224421f6cfeb2dbbd52fb97b8045f8db71615a7f76b29f4e338ff995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-miama-doc"

RDEPENDS:${PN} += ""

inherit rpm
