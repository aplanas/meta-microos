SUMMARY = "Documentation for texlive-mathfixs"
DESCRIPTION = "This package includes the documentation for texlive-mathfixs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn49547"

RPM_NAME = "texlive-mathfixs-doc-2023.201.1.01svn49547-52.1.noarch.rpm"
RPM_HASH = "237148393cec8278789eef14a7c080aa403d21b3d3d9c83bd090b4fe0305dab02cd9c50ffe91ddeb4b43c2de2d1893edc5869618ad608744e97dc69533828508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathfixs-doc"

RDEPENDS:${PN} += ""

inherit rpm
