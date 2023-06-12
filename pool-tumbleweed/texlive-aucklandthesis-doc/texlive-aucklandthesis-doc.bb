SUMMARY = "Documentation for texlive-aucklandthesis"
DESCRIPTION = "This package includes the documentation for texlive-aucklandthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn51323"

RPM_NAME = "texlive-aucklandthesis-doc-2023.201.svn51323-53.1.noarch.rpm"
RPM_HASH = "9642727bde8ef620a66e02e863a4a37e26d686eb02bc87910f5c6f95a1ed86c3cf62ba3f26cac0556c91d210977efe2f844798bfb313f5709cbb08dd29d86f92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aucklandthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
