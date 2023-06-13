SUMMARY = "Documentation for texlive-ccicons"
DESCRIPTION = "This package includes the documentation for texlive-ccicons"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn54512"

RPM_NAME = "texlive-ccicons-doc-2023.201.1.6svn54512-52.1.noarch.rpm"
RPM_HASH = "fd3e8269a0d14f58e5a0c7d04ce47aea987a0eb12a153bdb82d547600588e464d261e8815faf752b172f21370c6b311e4c1de0bd892bbb20eee9d4f6f2259deb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ccicons-doc"

RDEPENDS:${PN} += ""

inherit rpm
