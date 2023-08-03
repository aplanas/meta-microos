SUMMARY = "Documentation for texlive-xetex-pstricks"
DESCRIPTION = "This package includes the documentation for texlive-xetex-pstricks"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn17055"

RPM_NAME = "texlive-xetex-pstricks-doc-2023.209.svn17055-53.1.noarch.rpm"
RPM_HASH = "9bf3fdb1e2e47367e19d3c9ddd0649b5c691900627b42a09f4813200ad20c8cb41df4749a6d45907c7f68daac9f2af092cf74c46d7a9ec3b886e4a572920483f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-pstricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
