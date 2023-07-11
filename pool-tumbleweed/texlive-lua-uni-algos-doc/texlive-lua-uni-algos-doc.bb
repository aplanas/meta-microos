SUMMARY = "Documentation for texlive-lua-uni-algos"
DESCRIPTION = "This package includes the documentation for texlive-lua-uni-algos"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.4.1svn62204"

RPM_NAME = "texlive-lua-uni-algos-doc-2023.208.0.0.4.1svn62204-53.1.noarch.rpm"
RPM_HASH = "394a76d5631adfac3b9475e55262841b0c0683df9db9cf3df1ed8106cc15040093767cd3d58dfd223070a3fe05413f10497cfca84e81b29b896ad9288b6d1afe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-uni-algos-doc"

RDEPENDS:${PN} += ""

inherit rpm
