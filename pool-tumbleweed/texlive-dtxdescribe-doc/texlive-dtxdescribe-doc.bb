SUMMARY = "Documentation for texlive-dtxdescribe"
DESCRIPTION = "This package includes the documentation for texlive-dtxdescribe"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.07svn65445"

RPM_NAME = "texlive-dtxdescribe-doc-2023.201.1.07svn65445-52.1.noarch.rpm"
RPM_HASH = "128aaef719db5c8484a5a4858fcc7707bf8970e39533ad67f9b971b8e4c01c442580e0de536f8c3f7acfa23f82dbf208034d4b375e7ba234984f06f93ff02aad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dtxdescribe-doc"

RDEPENDS:${PN} += ""

inherit rpm
