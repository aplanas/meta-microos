SUMMARY = "Documentation for texlive-dotlessi"
DESCRIPTION = "This package includes the documentation for texlive-dotlessi"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn51476"

RPM_NAME = "texlive-dotlessi-doc-2023.201.1.1svn51476-52.1.noarch.rpm"
RPM_HASH = "feab476b064045df078b74c8953fa4a1635ba2dfb4fb7d2a8fe168569dbae92cd0f9ff9d21fa50e28fbd9e6f30c25684666ac60fafb62484aca6bc4610d806cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dotlessi-doc"

RDEPENDS:${PN} += ""

inherit rpm
