SUMMARY = "Documentation for texlive-skb"
DESCRIPTION = "This package includes the documentation for texlive-skb"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.52svn22781"

RPM_NAME = "texlive-skb-doc-2023.201.0.0.52svn22781-57.1.noarch.rpm"
RPM_HASH = "b5f09025a3c73fd1781c7f51f4a1a95000ea92db3a9b7a951e3a9970139e3388d2780df50398fac8cd3787e34d13d82fddc58e87f7478681bd2a63c26e0e7ef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skb-doc"

RDEPENDS:${PN} += ""

inherit rpm
