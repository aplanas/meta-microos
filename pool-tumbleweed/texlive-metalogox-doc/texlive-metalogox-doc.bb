SUMMARY = "Documentation for texlive-metalogox"
DESCRIPTION = "This package includes the documentation for texlive-metalogox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn65448"

RPM_NAME = "texlive-metalogox-doc-2023.201.1.01svn65448-54.1.noarch.rpm"
RPM_HASH = "7bf66fb8fb2ca4bd8feae85d21deb0e6df01dc3e05c57cb146dc12a9d9243e19efb65ca176cd2cfda5af816a60e7c21804f576be2315476a1c2b0d3b2d8c6cfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metalogox-doc"

RDEPENDS:${PN} += ""

inherit rpm
