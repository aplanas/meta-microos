SUMMARY = "Documentation for texlive-rlepsf"
DESCRIPTION = "This package includes the documentation for texlive-rlepsf"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19082"

RPM_NAME = "texlive-rlepsf-doc-2023.209.svn19082-54.1.noarch.rpm"
RPM_HASH = "91fbbe8f6af286585ba900a5ac99ed7f5316fc513d8bd9925092d3f107939900cc3edee369875db0f5a598be0b6f02d7a55cbd9bc5a3369b8731a58fba00c9a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rlepsf-doc"

RDEPENDS:${PN} += ""

inherit rpm
