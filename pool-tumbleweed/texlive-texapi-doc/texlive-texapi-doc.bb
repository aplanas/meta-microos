SUMMARY = "Documentation for texlive-texapi"
DESCRIPTION = "This package includes the documentation for texlive-texapi"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.04svn54080"

RPM_NAME = "texlive-texapi-doc-2023.209.1.04svn54080-55.1.noarch.rpm"
RPM_HASH = "38f2904b88a66c48810433d7d84ca40f4a9209ad7603b7ef5907f6ecb1377950a21b25f4923774cb07e0eeee0763e26b5b34925b52f1c058c39a20c57eb9b8e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texapi-doc"

RDEPENDS:${PN} += ""

inherit rpm
