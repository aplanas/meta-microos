SUMMARY = "Documentation for texlive-mweights"
DESCRIPTION = "This package includes the documentation for texlive-mweights"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53520"

RPM_NAME = "texlive-mweights-doc-2023.209.svn53520-55.1.noarch.rpm"
RPM_HASH = "89450126179627bacac83a06fabf1ef90276ce051f68c95d7c692def1ed7c4c166024c0ba084846efd6b1f8b4564dafcbba82abc564e48b71744dd4b989fd868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mweights-doc"

RDEPENDS:${PN} += ""

inherit rpm
