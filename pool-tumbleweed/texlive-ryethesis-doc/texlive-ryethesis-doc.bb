SUMMARY = "Documentation for texlive-ryethesis"
DESCRIPTION = "This package includes the documentation for texlive-ryethesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.36svn33945"

RPM_NAME = "texlive-ryethesis-doc-2023.201.1.36svn33945-53.1.noarch.rpm"
RPM_HASH = "eb3e52b2acbc52cf60e78725e42141dc39bf6a143108e6b57675a1994fca139c9025525bb59d0d9d45f77a989ea08851b1a8439db9719b08f0ad8883d4e2d9b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ryethesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
