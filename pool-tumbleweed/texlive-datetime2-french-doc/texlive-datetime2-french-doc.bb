SUMMARY = "Documentation for texlive-datetime2-french"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-french"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn56393"

RPM_NAME = "texlive-datetime2-french-doc-2023.201.1.03svn56393-52.1.noarch.rpm"
RPM_HASH = "bb36832f6cc9ca94af3aa719e6fc20acc352219a89d79d093aa0cc008219d2189e08b86505f2f8180283b06b7be1977e844ace3195586373ed32dc847080de9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-french-doc"
RDEPENDS:${PN} += ""

inherit rpm
