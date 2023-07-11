SUMMARY = "Documentation for texlive-ptptex"
DESCRIPTION = "This package includes the documentation for texlive-ptptex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.91svn19440"

RPM_NAME = "texlive-ptptex-doc-2023.201.0.0.91svn19440-53.2.noarch.rpm"
RPM_HASH = "055df56653b6a10452705e49af2f63ddeea664ef6a7dcc98f3287d49347f1c9a607c6045a94f2976c860c850b4124a855b8805bb4e172b2d69fbb62254627322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptptex-doc"

RDEPENDS:${PN} += ""

inherit rpm
