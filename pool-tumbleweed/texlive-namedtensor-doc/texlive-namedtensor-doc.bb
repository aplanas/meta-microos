SUMMARY = "Documentation for texlive-namedtensor"
DESCRIPTION = "This package includes the documentation for texlive-namedtensor"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn65346"

RPM_NAME = "texlive-namedtensor-doc-2023.201.0.0.4svn65346-54.1.noarch.rpm"
RPM_HASH = "3c87f14d7578d4de5bc2b50f4aca5524a626574f3ea35d88ff98cc8f63550bd7d39cc4ab6bf9da8fa4d52ca17a1e2c23a68ab0eeb1afa38812e9209bce1bd490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-namedtensor-doc"

RDEPENDS:${PN} += ""

inherit rpm
