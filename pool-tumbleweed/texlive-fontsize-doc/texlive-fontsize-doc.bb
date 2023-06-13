SUMMARY = "Documentation for texlive-fontsize"
DESCRIPTION = "This package includes the documentation for texlive-fontsize"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.5svn60161"

RPM_NAME = "texlive-fontsize-doc-2023.201.0.0.8.5svn60161-52.1.noarch.rpm"
RPM_HASH = "521c5308b12b98676efe017fbb8be0770bb8f20a7089aa54c3da981c90ba6460f573edad04c3cca60b12b1088bbe469ade559afb3502b428ff264b45d7d3b724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontsize-doc"

RDEPENDS:${PN} += ""

inherit rpm
