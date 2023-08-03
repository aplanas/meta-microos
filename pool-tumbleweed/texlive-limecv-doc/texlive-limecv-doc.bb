SUMMARY = "Documentation for texlive-limecv"
DESCRIPTION = "This package includes the documentation for texlive-limecv"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.12svn61199"

RPM_NAME = "texlive-limecv-doc-2023.209.0.0.1.12svn61199-55.1.noarch.rpm"
RPM_HASH = "4dab3c9c6e52c6e90ccef0cddc41a9e7f795e5571d5b83cfbfd6d4650cc0c4d53464584e459329dfbb2d86c69d9f3e48b70909d5f5765a2843236401ea64f9ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-limecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
