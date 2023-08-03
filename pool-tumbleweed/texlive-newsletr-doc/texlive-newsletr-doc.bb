SUMMARY = "Documentation for texlive-newsletr"
DESCRIPTION = "This package includes the documentation for texlive-newsletr"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-newsletr-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "4648e886a93b839df68c3ae4999e452ce04b31a7b8e859bbb4454fcf10ba1418174681eb5565dd9924b48da25899293da8b287a817c3d2241cfce06db6296b41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newsletr-doc"

RDEPENDS:${PN} += ""

inherit rpm
