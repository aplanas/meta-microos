SUMMARY = "Documentation for texlive-glossaries-finnish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-finnish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-glossaries-finnish-doc-2023.201.1.0svn54080-53.2.noarch.rpm"
RPM_HASH = "dc9b8e7edfb50b6d5ea7cfeba85a4e03ba286970d3f0566beefeaa10d4fde94aeb854b50f94de066253b6b9dc808c3a332e02c9ff066a94a6603d0c926851655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-finnish-doc"

RDEPENDS:${PN} += ""

inherit rpm
