SUMMARY = "Documentation for texlive-magicnum"
DESCRIPTION = "This package includes the documentation for texlive-magicnum"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn52983"

RPM_NAME = "texlive-magicnum-doc-2023.201.1.7svn52983-52.1.noarch.rpm"
RPM_HASH = "652893cd5402a04e89de06f31808170f1cf698a06cb901718d5423ce29498cb64ae2b55f4c757433adebf8cdbb60596539748236d42df4f0c26b892500d95b0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-magicnum-doc"
RDEPENDS:${PN} += ""

inherit rpm
