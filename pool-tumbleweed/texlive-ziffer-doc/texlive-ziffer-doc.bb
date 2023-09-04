SUMMARY = "Documentation for texlive-ziffer"
DESCRIPTION = "This package includes the documentation for texlive-ziffer"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn32279"

RPM_NAME = "texlive-ziffer-doc-2023.209.2.1svn32279-53.2.noarch.rpm"
RPM_HASH = "636b705d566fa98750943c19558bee472385a50bb9ce17bb9ac1448d6a28803363d1acb62599f35c96d6c4b3d1505a3b6d27270be10d4db17270be0c629d1411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ziffer-doc"

RDEPENDS:${PN} += ""

inherit rpm
