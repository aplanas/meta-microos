SUMMARY = "Documentation for texlive-ptex-base"
DESCRIPTION = "This package includes the documentation for texlive-ptex-base"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn64072"

RPM_NAME = "texlive-ptex-base-doc-2023.201.svn64072-53.2.noarch.rpm"
RPM_HASH = "608dc076609eea29196aa17fa7950cb1ee3223f737b3d8cc3f225ac23199530c2fca75d56b5c4932c9a201a10ba6881d24b7ebdd3aad1cc59f4b7eae4cd44512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-base-doc"

RDEPENDS:${PN} += ""

inherit rpm
