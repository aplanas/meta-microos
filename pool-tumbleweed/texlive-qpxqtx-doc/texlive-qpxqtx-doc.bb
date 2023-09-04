SUMMARY = "Documentation for texlive-qpxqtx"
DESCRIPTION = "This package includes the documentation for texlive-qpxqtx"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45797"

RPM_NAME = "texlive-qpxqtx-doc-2023.209.svn45797-54.2.noarch.rpm"
RPM_HASH = "12b1439cd6251fe4369686f262debd6a85fc6e75dbc15802bc77faadf656ab6d32ee546aaf1153a60c4378b8d360398491a788146bed5536bf78079e7a24e62a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qpxqtx-doc"

RDEPENDS:${PN} += ""

inherit rpm
