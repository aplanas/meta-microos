SUMMARY = "Documentation for texlive-ebgaramond"
DESCRIPTION = "This package includes the documentation for texlive-ebgaramond"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64343"

RPM_NAME = "texlive-ebgaramond-doc-2023.201.svn64343-53.1.noarch.rpm"
RPM_HASH = "ec2d86a1ff66207396f6a7bc17f128bd537e89fa904daadb3e62f70b377fbea0ac433d21d3a099a8a7a3a16598126a9dff8a5d15d6d07611a380e7e867bd90b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebgaramond-doc"
RDEPENDS:${PN} += ""

inherit rpm
