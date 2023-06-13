SUMMARY = "Documentation for texlive-projlib"
DESCRIPTION = "This package includes the documentation for texlive-projlib"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65475"

RPM_NAME = "texlive-projlib-doc-2023.201.svn65475-52.1.noarch.rpm"
RPM_HASH = "62007ccad6d249044fac6b12241ba5e385db04c6f2b7202504444ce0d8e296604d255e9cdeb26d6b1dcedd49a165c673b63737e41e8feb1f71d644c318bdc87c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-projlib-doc"

RDEPENDS:${PN} += ""

inherit rpm
