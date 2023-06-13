SUMMARY = "Documentation for texlive-filedate"
DESCRIPTION = "This package includes the documentation for texlive-filedate"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29529"

RPM_NAME = "texlive-filedate-doc-2023.201.svn29529-52.1.noarch.rpm"
RPM_HASH = "7330559c6d6a402f158ec93b44b3e35c0d47cf80005a401207aa589ec9df525f7531e6e3b03908b9cfc43b0cf7e94fccd1a8bbde55d3c1a49fc4983320cd35f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-filedate-doc"

RDEPENDS:${PN} += ""

inherit rpm
