SUMMARY = "Documentation for texlive-lion-msc"
DESCRIPTION = "This package includes the documentation for texlive-lion-msc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.30svn55415"

RPM_NAME = "texlive-lion-msc-doc-2023.209.0.0.30svn55415-55.1.noarch.rpm"
RPM_HASH = "00ba97a036e5c6e428f53d8e43341969d02a57ba2d4839a3b149c9575e0d7a1914628f2671a18d0675b071c7b0fea032424f88f4b37d8d5662c8de9c8180cdbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lion-msc-doc"

RDEPENDS:${PN} += ""

inherit rpm
