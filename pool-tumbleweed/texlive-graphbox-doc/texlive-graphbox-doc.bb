SUMMARY = "Documentation for texlive-graphbox"
DESCRIPTION = "This package includes the documentation for texlive-graphbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn46360"

RPM_NAME = "texlive-graphbox-doc-2023.201.1.1svn46360-53.2.noarch.rpm"
RPM_HASH = "be3f9b6978294e835e7bff4a6202bfbfa45ad8e2941fca5ad9a321e2340c05592ae45296b1aa1cbd18ea8505e7b05c63ee6231d535a927251f0233615db9600c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
