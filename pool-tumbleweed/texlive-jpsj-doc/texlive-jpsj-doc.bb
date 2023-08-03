SUMMARY = "Documentation for texlive-jpsj"
DESCRIPTION = "This package includes the documentation for texlive-jpsj"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.2svn66115"

RPM_NAME = "texlive-jpsj-doc-2023.209.1.2.2svn66115-56.1.noarch.rpm"
RPM_HASH = "d31305216634552f3faae396e5b669ebe719947a059f03e4069e80cf9cc0e60d3905df16cc26e6e99f94607fd6d6a29dac83e7bc5eb6dc6e001237b37bf9b57b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jpsj-doc"

RDEPENDS:${PN} += ""

inherit rpm
