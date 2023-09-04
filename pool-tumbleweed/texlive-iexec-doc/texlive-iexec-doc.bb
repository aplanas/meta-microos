SUMMARY = "Documentation for texlive-iexec"
DESCRIPTION = "This package includes the documentation for texlive-iexec"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11.4svn64908"

RPM_NAME = "texlive-iexec-doc-2023.209.0.0.11.4svn64908-54.1.noarch.rpm"
RPM_HASH = "f698a1374c3a2e49ddbc6554e51732d9d04e61c0ee34ac54f74008189abb73111080017ebb7534af2d5a0a1d668dcaa533c2293640fa9ad20e4430bbedd35b8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iexec-doc"

RDEPENDS:${PN} += ""

inherit rpm
