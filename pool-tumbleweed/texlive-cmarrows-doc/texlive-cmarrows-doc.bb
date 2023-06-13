SUMMARY = "Documentation for texlive-cmarrows"
DESCRIPTION = "This package includes the documentation for texlive-cmarrows"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn24378"

RPM_NAME = "texlive-cmarrows-doc-2023.201.0.0.9svn24378-53.1.noarch.rpm"
RPM_HASH = "61a0ac7b6fad9b6ea9d26302dee14797cf104896e05c0a159dd44a475e3274ae8a009e9417aeed23823a1fd37255c15b7ef5a2fb5f9c0599cc834f82e3ea81a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmarrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
