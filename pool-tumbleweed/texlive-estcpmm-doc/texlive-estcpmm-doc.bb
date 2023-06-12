SUMMARY = "Documentation for texlive-estcpmm"
DESCRIPTION = "This package includes the documentation for texlive-estcpmm"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn17335"

RPM_NAME = "texlive-estcpmm-doc-2023.201.0.0.4svn17335-52.1.noarch.rpm"
RPM_HASH = "c5e5e515e3d19def564a6ec2e718645b4d9a82f5d99f40d798208121b8d3e15299bce33c2c9b59858e659a59266c59a2bb7c96d7f476e5d7af9e2e649c1d74d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-estcpmm-doc"
RDEPENDS:${PN} += ""

inherit rpm
