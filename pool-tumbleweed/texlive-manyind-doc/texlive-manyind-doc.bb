SUMMARY = "Documentation for texlive-manyind"
DESCRIPTION = "This package includes the documentation for texlive-manyind"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn49874"

RPM_NAME = "texlive-manyind-doc-2023.208.svn49874-53.1.noarch.rpm"
RPM_HASH = "d8aa790b833c492ba5dfbf94abcd57a71b7df3a24d3ae32cab8fc19137ebe5924aec171c221e903e6c9dbaf281a501b8d71721c9198de5ac7c725e42d4aa22e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-manyind-doc"

RDEPENDS:${PN} += ""

inherit rpm
