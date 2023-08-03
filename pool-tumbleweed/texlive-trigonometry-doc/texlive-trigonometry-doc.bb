SUMMARY = "Documentation for texlive-trigonometry"
DESCRIPTION = "This package includes the documentation for texlive-trigonometry"
LICENSE = "SUSE-TeX"

PV = "2023.209.svn43006"

RPM_NAME = "texlive-trigonometry-doc-2023.209.svn43006-53.1.noarch.rpm"
RPM_HASH = "0bb34ee5e5b4fd0ed6b591d7bf8f96eff59a7b99b734e8c858eb13c1c5e438686ac9a63e6945af5fefaa1ba8b3cd6d9cbb774da393db6f10187e5e4832d49c9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-trigonometry-doc"

RDEPENDS:${PN} += ""

inherit rpm
