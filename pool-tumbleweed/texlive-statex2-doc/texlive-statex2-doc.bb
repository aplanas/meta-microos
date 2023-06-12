SUMMARY = "Documentation for texlive-statex2"
DESCRIPTION = "This package includes the documentation for texlive-statex2"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn23961"

RPM_NAME = "texlive-statex2-doc-2023.201.2.1svn23961-57.1.noarch.rpm"
RPM_HASH = "f8e5e4ff34d961b930aa91aea9259ac8d608f57233fbda391b3509ea2602cdcb90ab8adef0cf0ea0fe63d4d137a75c107631cab7adb149f4da82c0e695049fcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-statex2-doc"
RDEPENDS:${PN} += ""

inherit rpm
