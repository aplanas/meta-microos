SUMMARY = "Documentation for texlive-bbcard"
DESCRIPTION = "This package includes the documentation for texlive-bbcard"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn19440"

RPM_NAME = "texlive-bbcard-doc-2023.209.svn19440-54.1.noarch.rpm"
RPM_HASH = "84db8e11273e0cc163cf8510f57d28d3c99a776a89ff9942d2b08d870b8b0e681ffc0917a22980a2afac8f8bd3791580a9788aaf65f7224e089a33db42eefe0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbcard-doc"

RDEPENDS:${PN} += ""

inherit rpm
