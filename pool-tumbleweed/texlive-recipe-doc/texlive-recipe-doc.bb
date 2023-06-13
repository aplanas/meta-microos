SUMMARY = "Documentation for texlive-recipe"
DESCRIPTION = "This package includes the documentation for texlive-recipe"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.9svn54080"

RPM_NAME = "texlive-recipe-doc-2023.201.0.0.9svn54080-53.1.noarch.rpm"
RPM_HASH = "f10e632a60123019382ae0adb84da60a05cd784ad981611d0fe085c3bd63927f5c274f2ab7b427ff43ccd3628191c2a10ea8614d65fa4197a69bd01c5d24aade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-recipe-doc:it) \
texlive-recipe-doc"

RDEPENDS:${PN} += ""

inherit rpm
