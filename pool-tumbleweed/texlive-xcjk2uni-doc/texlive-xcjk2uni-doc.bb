SUMMARY = "Documentation for texlive-xcjk2uni"
DESCRIPTION = "This package includes the documentation for texlive-xcjk2uni"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54958"

RPM_NAME = "texlive-xcjk2uni-doc-2023.209.1.0svn54958-53.2.noarch.rpm"
RPM_HASH = "dae96e28cf1f48026cb4b7db108bafa6f5f832f92432c1efaf40e8dfff0f8598911f7f48ae1cfda30c554d0b07a19a4489f4a743d3f601b638208f4a18e952f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xcjk2uni-doc-zh \
texlive-xcjk2uni-doc"

RDEPENDS:${PN} += ""

inherit rpm
