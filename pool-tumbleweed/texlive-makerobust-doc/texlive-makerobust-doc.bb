SUMMARY = "Documentation for texlive-makerobust"
DESCRIPTION = "This package includes the documentation for texlive-makerobust"
LICENSE = "LPPL-1.0"

PV = "2023.208.2.0svn52811"

RPM_NAME = "texlive-makerobust-doc-2023.208.2.0svn52811-53.1.noarch.rpm"
RPM_HASH = "e858514df5760d3b4d4fb038930fdc99cb9ae630edbb1a2e0fcf852d07dc6fccbeb2165b807b3bd64565b0e8a6b633182e185d89a82a8030a80a1680f145c324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-makerobust-doc-en \
texlive-makerobust-doc"

RDEPENDS:${PN} += ""

inherit rpm
