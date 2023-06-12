SUMMARY = "Documentation for texlive-texcount"
DESCRIPTION = "This package includes the documentation for texlive-texcount"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1.1svn49013"

RPM_NAME = "texlive-texcount-doc-2023.201.3.1.1svn49013-54.1.noarch.rpm"
RPM_HASH = "9327ef0d4b349fe69f8674f82c8710c28e52019ded0f71489b177fa416dd00b45fda9bd666eef1a6571aa43cd23e81ce20d6808ad0c55a51900fc038b966a892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texcount-doc"
RDEPENDS:${PN} += ""

inherit rpm
