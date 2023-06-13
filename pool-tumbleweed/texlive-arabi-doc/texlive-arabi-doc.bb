SUMMARY = "Documentation for texlive-arabi"
DESCRIPTION = "This package includes the documentation for texlive-arabi"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn44662"

RPM_NAME = "texlive-arabi-doc-2023.201.1.1svn44662-54.1.noarch.rpm"
RPM_HASH = "386f3b14af02030567171bd446381c6414f4b341ae42550f9cb1cf9d9bae904ebee32a0285e6aebd29274501f8312b6d908c53e107c8f52afbe4b6bf17f96b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabi-doc"

RDEPENDS:${PN} += ""

inherit rpm
