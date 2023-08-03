SUMMARY = "Documentation for texlive-sepnum"
DESCRIPTION = "This package includes the documentation for texlive-sepnum"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn20186"

RPM_NAME = "texlive-sepnum-doc-2023.209.2.0svn20186-54.1.noarch.rpm"
RPM_HASH = "f929cc17556ec143986eec7d9374796063b42a61f6effbe242d1d7f6c23b613560e8567157829f09a5ec1f89c7d64f0b241bd00ba2cc753f5d9f0995e6f0fac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sepnum-doc"

RDEPENDS:${PN} += ""

inherit rpm
