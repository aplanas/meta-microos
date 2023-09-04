SUMMARY = "Documentation for texlive-ycbook"
DESCRIPTION = "This package includes the documentation for texlive-ycbook"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn46201"

RPM_NAME = "texlive-ycbook-doc-2023.209.svn46201-53.2.noarch.rpm"
RPM_HASH = "2015ccb8651c9f9db6cce489a05d70e00fde602d9c489d407dc055cf03dee54c3ab0624d6bd84aae3ed46fba5eb073f407935893a4d8bb84b33772fb6d646346"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ycbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
