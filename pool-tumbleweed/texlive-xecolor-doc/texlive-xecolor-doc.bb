SUMMARY = "Documentation for texlive-xecolor"
DESCRIPTION = "This package includes the documentation for texlive-xecolor"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn29660"

RPM_NAME = "texlive-xecolor-doc-2023.201.0.0.1svn29660-52.2.noarch.rpm"
RPM_HASH = "c9bb05dd53bc314008549394c7c6f6e92bbcf851c1b694aa0df9204b3f6fa8a6da1328d1ec501580e928d7a85abdce5ce81da01f9c1f3a795f84e16bacf7047d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xecolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
