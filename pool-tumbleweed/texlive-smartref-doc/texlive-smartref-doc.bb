SUMMARY = "Documentation for texlive-smartref"
DESCRIPTION = "This package includes the documentation for texlive-smartref"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9svn20311"

RPM_NAME = "texlive-smartref-doc-2023.201.1.9svn20311-57.1.noarch.rpm"
RPM_HASH = "e3d4c09813a46e7bdc568f7d5d822da7040c8103ad0200c8c892696e31c616c7eb228c86c3886217e3db14780fd45a833127c70af1b6684b16730a033d8629d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-smartref-doc"
RDEPENDS:${PN} += ""

inherit rpm
