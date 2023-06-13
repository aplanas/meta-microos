SUMMARY = "Documentation for texlive-l3experimental"
DESCRIPTION = "This package includes the documentation for texlive-l3experimental"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65621"

RPM_NAME = "texlive-l3experimental-doc-2023.201.svn65621-55.1.noarch.rpm"
RPM_HASH = "dc8c86368a55f4022d140cf6d0638577c4e84258271c6f7d80b1fbee092ed5e2ea351ffd06bd3ec0a320e4a646822b5db6872555e5950db9830cc4b8b66c7750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l3experimental-doc"

RDEPENDS:${PN} += ""

inherit rpm
