SUMMARY = "Documentation for texlive-cabin"
DESCRIPTION = "This package includes the documentation for texlive-cabin"
LICENSE = "OFL-1.1"

PV = "2023.201.svn65358"

RPM_NAME = "texlive-cabin-doc-2023.201.svn65358-52.1.noarch.rpm"
RPM_HASH = "33ef679bb7cb082a18dba3d22b6b56ee278414c47457057ed07e40a6a75dddc4062e4c2505cf58c2ca353beb30785eec88b8e1f81a0189ecd8212881170749f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cabin-doc"

RDEPENDS:${PN} += ""

inherit rpm
