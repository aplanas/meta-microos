SUMMARY = "Documentation for texlive-bbm-macros"
DESCRIPTION = "This package includes the documentation for texlive-bbm-macros"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17224"

RPM_NAME = "texlive-bbm-macros-doc-2023.201.svn17224-53.1.noarch.rpm"
RPM_HASH = "9c5757dd875918212a1179437cb418b812fad974723d159e879c4b1f96470652a4309878c367995568a23e1063aec655170c372f1a07e0279976268461cf2216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbm-macros-doc"

RDEPENDS:${PN} += ""

inherit rpm
