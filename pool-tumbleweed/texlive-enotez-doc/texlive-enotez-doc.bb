SUMMARY = "Documentation for texlive-enotez"
DESCRIPTION = "This package includes the documentation for texlive-enotez"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.10dsvn61490"

RPM_NAME = "texlive-enotez-doc-2023.201.0.0.10dsvn61490-53.2.noarch.rpm"
RPM_HASH = "5157931662e181c33144ca7789cc2c7df4654104115188ec3b85c3af643c56f9885a38498ed6c65271eee8a43cef7340466a781d6cbccc25470b0132e0a17bf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enotez-doc"

RDEPENDS:${PN} += ""

inherit rpm
