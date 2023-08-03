SUMMARY = "Documentation for texlive-gfsartemisia"
DESCRIPTION = "This package includes the documentation for texlive-gfsartemisia"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn19469"

RPM_NAME = "texlive-gfsartemisia-doc-2023.209.1.0svn19469-53.1.noarch.rpm"
RPM_HASH = "f03ced8ee8ae0862f6ad2525e449bf4a840bc4a8559c58a76a5e0067e6831698c886f5be7348e54b11d4f06fedc1edc27b80cdc774a867840c16ba4964cbbdb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsartemisia-doc"

RDEPENDS:${PN} += ""

inherit rpm
