SUMMARY = "Documentation for texlive-lua-uni-algos"
DESCRIPTION = "This package includes the documentation for texlive-lua-uni-algos"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.1svn62204"

RPM_NAME = "texlive-lua-uni-algos-doc-2023.201.0.0.4.1svn62204-52.1.noarch.rpm"
RPM_HASH = "45a9611a8f8d60b00425fb8526bd5581de27ec1b09b89515bbb55a5ab84b0874e09b7d91c7af2e0dcd05ff91023bab6330c351ccb414f78465183929ceab4cfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-uni-algos-doc"

RDEPENDS:${PN} += ""

inherit rpm
