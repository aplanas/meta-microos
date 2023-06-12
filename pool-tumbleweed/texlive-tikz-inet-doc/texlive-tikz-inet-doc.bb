SUMMARY = "Documentation for texlive-tikz-inet"
DESCRIPTION = "This package includes the documentation for texlive-tikz-inet"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-tikz-inet-doc-2023.201.0.0.1svn15878-52.1.noarch.rpm"
RPM_HASH = "1064f4ccfce36657a458a0e8e362dbb0417a1371a6201de600a718ef38099e78fca2e36fe0dcb1e9ac22d7690c7a85ddb51c8b5faf0e449aec0bf68efb0e28a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-inet-doc"
RDEPENDS:${PN} += ""

inherit rpm
