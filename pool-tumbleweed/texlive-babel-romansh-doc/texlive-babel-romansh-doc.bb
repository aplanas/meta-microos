SUMMARY = "Documentation for texlive-babel-romansh"
DESCRIPTION = "This package includes the documentation for texlive-babel-romansh"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn30286"

RPM_NAME = "texlive-babel-romansh-doc-2023.201.svn30286-53.1.noarch.rpm"
RPM_HASH = "529317dd21a416e7a2a0685e4ff70869bc74db7a08da9b7b2ecda3b946e89dad9b90bc02a68cde7a358d83e9874249886a93146ebe9d0e6ef7168bf83f11fb5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-romansh-doc"

RDEPENDS:${PN} += ""

inherit rpm
