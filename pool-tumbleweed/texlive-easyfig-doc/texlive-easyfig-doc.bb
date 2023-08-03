SUMMARY = "Documentation for texlive-easyfig"
DESCRIPTION = "This package includes the documentation for texlive-easyfig"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn64967"

RPM_NAME = "texlive-easyfig-doc-2023.209.1.2asvn64967-54.1.noarch.rpm"
RPM_HASH = "4fac31f235895415f1e6d1fefb89d2915d732ecd4d0cf6c8c74425fecdd6b206d911fe253f2efe0eec6b77093e322dea37baf50b6282bca959aafd58e47f6f10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
