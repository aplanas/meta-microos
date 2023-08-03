SUMMARY = "Documentation for texlive-bussproofs"
DESCRIPTION = "This package includes the documentation for texlive-bussproofs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn54080"

RPM_NAME = "texlive-bussproofs-doc-2023.209.1.1svn54080-53.1.noarch.rpm"
RPM_HASH = "06ee8715ead65e2934bbb92a519da5feb34dfb813edee97184e6ade1c3234a7da95046013be864a00bfb1611cef526e98f52019c0c2020bd3234ea78e6539208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bussproofs-doc"

RDEPENDS:${PN} += ""

inherit rpm
