SUMMARY = "Documentation for texlive-grabbox"
DESCRIPTION = "This package includes the documentation for texlive-grabbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn65223"

RPM_NAME = "texlive-grabbox-doc-2023.201.1.4svn65223-53.1.noarch.rpm"
RPM_HASH = "6ef3264e49585ddb5f9972c94ebe71a69c904f995af9f0265556756e1bb25510240c182db59a857eda0c485ebe44973134a4a3edb79ef46dc211707de039f475"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grabbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
