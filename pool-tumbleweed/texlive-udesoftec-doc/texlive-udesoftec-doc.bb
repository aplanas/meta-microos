SUMMARY = "Documentation for texlive-udesoftec"
DESCRIPTION = "This package includes the documentation for texlive-udesoftec"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7.1svn57866"

RPM_NAME = "texlive-udesoftec-doc-2023.201.1.7.1svn57866-53.1.noarch.rpm"
RPM_HASH = "d5bb1276b7ac1697349b5c9d07975a6ecd305ca0be51615282c2fd0f1ea4804617a092015f19ba73e12a0edd4baf3cc951c34e9e230a938993bc0f732506a09a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-udesoftec-doc-de \
texlive-udesoftec-doc"

RDEPENDS:${PN} += ""

inherit rpm
