SUMMARY = "Documentation for texlive-uwa-pif"
DESCRIPTION = "This package includes the documentation for texlive-uwa-pif"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn64491"

RPM_NAME = "texlive-uwa-pif-doc-2023.201.1.0.1svn64491-53.1.noarch.rpm"
RPM_HASH = "1e50d58495ec14c09e040f704c34c636c0a406cb60d7ac9af485e7d4882f6dad4fa6eb2f8cf66d6dab83b48f026f1fbeb0a9cdee95e69b9e26f9dab92060ad79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwa-pif-doc"
RDEPENDS:${PN} += ""

inherit rpm
