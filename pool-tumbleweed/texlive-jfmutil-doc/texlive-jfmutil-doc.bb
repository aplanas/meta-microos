SUMMARY = "Documentation for texlive-jfmutil"
DESCRIPTION = "This package includes the documentation for texlive-jfmutil"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.3svn60987"

RPM_NAME = "texlive-jfmutil-doc-2023.201.1.3.3svn60987-55.1.noarch.rpm"
RPM_HASH = "1a28566c60f325eed87922dc0100131825ad9b4c2bbdeb731e64341443209b0ee12faf79471845850b9e4403b3d70ace03d04f3b4590f4a859d3f254ce55b843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-jfmutil-doc:ja) \
texlive-jfmutil-doc"

RDEPENDS:${PN} += ""

inherit rpm
