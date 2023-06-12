SUMMARY = "Documentation for texlive-hep-float"
DESCRIPTION = "This package includes the documentation for texlive-hep-float"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64904"

RPM_NAME = "texlive-hep-float-doc-2023.201.1.1svn64904-53.1.noarch.rpm"
RPM_HASH = "c5480d5034f52eee149ac9bff3139ba3e58b577c358c35af54a303127c9514c64dc6758f43b213b40251f893ad7031c8bdef03fae6c93ebbb1f680afcc6d359b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-float-doc"
RDEPENDS:${PN} += ""

inherit rpm
