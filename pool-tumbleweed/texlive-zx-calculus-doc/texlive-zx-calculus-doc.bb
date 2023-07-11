SUMMARY = "Documentation for texlive-zx-calculus"
DESCRIPTION = "This package includes the documentation for texlive-zx-calculus"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn60838"

RPM_NAME = "texlive-zx-calculus-doc-2023.201.svn60838-52.2.noarch.rpm"
RPM_HASH = "691b9cc839fc6a289e19b78eeadf38385de8d58f69362676db1e126e02cace81b6238e05cf0f4a07c182944c4b7779664503df004e293968727eaa19a81f2104"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zx-calculus-doc"

RDEPENDS:${PN} += ""

inherit rpm
