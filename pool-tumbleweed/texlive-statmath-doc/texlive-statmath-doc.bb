SUMMARY = "Documentation for texlive-statmath"
DESCRIPTION = "This package includes the documentation for texlive-statmath"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn46925"

RPM_NAME = "texlive-statmath-doc-2023.209.0.0.1svn46925-58.1.noarch.rpm"
RPM_HASH = "ad5759673c997fd0627df8fd6c0d1e302f3a68cbbdc7eafcec5bd002d4b20f5ed3a61bf88436bf44abe786efe08712054d827ec291b81abbff8082d41bc1fa13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-statmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
