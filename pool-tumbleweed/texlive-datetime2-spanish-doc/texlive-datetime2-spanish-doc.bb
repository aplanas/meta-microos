SUMMARY = "Documentation for texlive-datetime2-spanish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-spanish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn45785"

RPM_NAME = "texlive-datetime2-spanish-doc-2023.201.1.1svn45785-52.1.noarch.rpm"
RPM_HASH = "58187285a4cd94224c2d354cac93d58e0386f17346a0767b15b42d4c3ce7a015593c95ae5bc1c13d427216d2a8a3ee98b6e303729932ebbaed1a61227d7334b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-spanish-doc"

RDEPENDS:${PN} += ""

inherit rpm
