SUMMARY = "Documentation for texlive-ms"
DESCRIPTION = "This package includes the documentation for texlive-ms"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn57473"

RPM_NAME = "texlive-ms-doc-2023.201.svn57473-54.1.noarch.rpm"
RPM_HASH = "db9facd5b5736902a7705a885755e5d55ed8723e0e581a9ed09eda55288f19705f539632d5d133a147123173400ae2408f658610fb7043b993be7c362ce6bc28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ms-doc"
RDEPENDS:${PN} += ""

inherit rpm
