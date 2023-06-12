SUMMARY = "Documentation for texlive-boolexpr"
DESCRIPTION = "This package includes the documentation for texlive-boolexpr"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.14svn17830"

RPM_NAME = "texlive-boolexpr-doc-2023.201.3.14svn17830-52.1.noarch.rpm"
RPM_HASH = "ecb21f7a4b6afc5a9acf35e27f0abc14145577aa32cabcedf1aad3ebec0befac6d9c9e71d8f27c815a279ba1b70423e7a83b198c8e80dae4c65492e207a98e25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boolexpr-doc"
RDEPENDS:${PN} += ""

inherit rpm
