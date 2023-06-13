SUMMARY = "Documentation for texlive-logpap"
DESCRIPTION = "This package includes the documentation for texlive-logpap"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn15878"

RPM_NAME = "texlive-logpap-doc-2023.201.0.0.6svn15878-54.1.noarch.rpm"
RPM_HASH = "989ef3d7f88a63f9edd62275ab8816544d752202a10df40ef76bda9604c35bbc48d0bed16033192ae6876200f2a15590d852c76515c9440a96f7fa543d0a5148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logpap-doc"

RDEPENDS:${PN} += ""

inherit rpm
