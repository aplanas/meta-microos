SUMMARY = "Documentation for texlive-calcage"
DESCRIPTION = "This package includes the documentation for texlive-calcage"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.90svn27725"

RPM_NAME = "texlive-calcage-doc-2023.201.0.0.90svn27725-52.1.noarch.rpm"
RPM_HASH = "f559daef317ca12b9a2355dc857fceb69643ed18b5264d358a52cbc1f1035379e6637df0b994624e48ce4785984c814f80a81aac6586afd6a10a837faa3ff272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calcage-doc"
RDEPENDS:${PN} += ""

inherit rpm
