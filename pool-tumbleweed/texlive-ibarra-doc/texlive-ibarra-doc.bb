SUMMARY = "Documentation for texlive-ibarra"
DESCRIPTION = "This package includes the documentation for texlive-ibarra"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64567"

RPM_NAME = "texlive-ibarra-doc-2023.201.svn64567-52.1.noarch.rpm"
RPM_HASH = "4d29b21c3bb96d1cb62142e1778f9ea0055b0f938a5431c7a3a0e4e6db0f480326cb5f34f9fe098f7e85e629320dd9090475981b618f8deaf71fedacbdcec933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ibarra-doc"

RDEPENDS:${PN} += ""

inherit rpm
