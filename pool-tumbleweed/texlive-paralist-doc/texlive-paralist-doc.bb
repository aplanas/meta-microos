SUMMARY = "Documentation for texlive-paralist"
DESCRIPTION = "This package includes the documentation for texlive-paralist"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn43021"

RPM_NAME = "texlive-paralist-doc-2023.209.2.7svn43021-52.1.noarch.rpm"
RPM_HASH = "661a864d3c068fd38aea7b7387cedb5ae4878c7e9cea3ddae1897c8762e9eec3c0d036a500a8452a717702cc9122df646a0133164eca9d9bbd5b985a53b5c398"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-paralist-doc"

RDEPENDS:${PN} += ""

inherit rpm
