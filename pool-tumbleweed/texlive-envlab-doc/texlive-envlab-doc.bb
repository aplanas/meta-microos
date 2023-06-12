SUMMARY = "Documentation for texlive-envlab"
DESCRIPTION = "This package includes the documentation for texlive-envlab"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61937"

RPM_NAME = "texlive-envlab-doc-2023.201.1.2svn61937-53.1.noarch.rpm"
RPM_HASH = "bab1c15221665b4ab06a24a06ec4a665b96d1b9ad18c7c8d29f051d0d797e732d8345884aca1e5f7f3b6a83e133befda3cfe72f3f4bb056123b08d0225cdb8cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-envlab-doc"
RDEPENDS:${PN} += ""

inherit rpm
