SUMMARY = "Documentation for texlive-aastex"
DESCRIPTION = "This package includes the documentation for texlive-aastex"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.3.1svn58057"

RPM_NAME = "texlive-aastex-doc-2023.201.6.3.1svn58057-54.1.noarch.rpm"
RPM_HASH = "0af2f9eb48658b2e49b99108203b603650f84165b65f582457dc631bd085287e4ee19633cef635ee141e681196badc8ee496eadceeba2ae997df731375b91c51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aastex-doc"
RDEPENDS:${PN} += ""

inherit rpm
