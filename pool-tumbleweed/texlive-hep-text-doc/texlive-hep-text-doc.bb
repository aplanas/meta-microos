SUMMARY = "Documentation for texlive-hep-text"
DESCRIPTION = "This package includes the documentation for texlive-hep-text"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64906"

RPM_NAME = "texlive-hep-text-doc-2023.201.1.1svn64906-53.2.noarch.rpm"
RPM_HASH = "4d0d117dea96606eba684ac0092b760d752c885160e16cf954ca97d9d7692dd481114fd573566968ad6726aed0c0be8d4f7a3c173ecffae0085b917829fff990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-text-doc"

RDEPENDS:${PN} += ""

inherit rpm
