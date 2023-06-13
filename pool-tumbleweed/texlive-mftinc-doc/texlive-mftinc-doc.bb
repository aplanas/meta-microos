SUMMARY = "Documentation for texlive-mftinc"
DESCRIPTION = "This package includes the documentation for texlive-mftinc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn15878"

RPM_NAME = "texlive-mftinc-doc-2023.201.1.0asvn15878-54.1.noarch.rpm"
RPM_HASH = "52a810582c507be32b8857b5d673ac1b744e29038f9a13d9dca726d906e2d2fe77c3d041fed4d48cb7739d315c8e6e3f7f55d6341b8a5c60bc50f17ad56819ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mftinc-doc"

RDEPENDS:${PN} += ""

inherit rpm
