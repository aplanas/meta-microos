SUMMARY = "Documentation for texlive-ptex-base"
DESCRIPTION = "This package includes the documentation for texlive-ptex-base"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn64072"

RPM_NAME = "texlive-ptex-base-doc-2023.201.svn64072-53.1.noarch.rpm"
RPM_HASH = "c529807adc5a941be37249ff0b6360a2b71d31f77dd1d8a20c9a618ecbb8ca914d0daaf79a06bd30826efa267c7dbf260120af8846158d89e37d6a147ca7c595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-base-doc"

RDEPENDS:${PN} += ""

inherit rpm
