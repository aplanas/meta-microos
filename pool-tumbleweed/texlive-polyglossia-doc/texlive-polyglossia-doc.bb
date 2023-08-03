SUMMARY = "Documentation for texlive-polyglossia"
DESCRIPTION = "This package includes the documentation for texlive-polyglossia"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.60svn65792"

RPM_NAME = "texlive-polyglossia-doc-2023.209.1.60svn65792-53.1.noarch.rpm"
RPM_HASH = "c7d8b1aee446b54d490a8af43660c6a68edc2152c372cc0950067158f279626a4db34976dd050882f06d4e1868f8f34296aef62829dd75d1394aa7c678e3b1d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-polyglossia-doc"

RDEPENDS:${PN} += ""

inherit rpm
