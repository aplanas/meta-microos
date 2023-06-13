SUMMARY = "Documentation for texlive-ucalgmthesis"
DESCRIPTION = "This package includes the documentation for texlive-ucalgmthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn52527"

RPM_NAME = "texlive-ucalgmthesis-doc-2023.201.svn52527-52.1.noarch.rpm"
RPM_HASH = "407cae53e94ed21c03e32ebad8aa21e4ad0ed3fe35010fb6b9f9ef6315f1ea5c1d385100c969dc75b58bb2430291639f10c4f2f6b68df20b0a078aea19d24894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucalgmthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
