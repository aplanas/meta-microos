SUMMARY = "Documentation for texlive-thalie"
DESCRIPTION = "This package includes the documentation for texlive-thalie"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13asvn65249"

RPM_NAME = "texlive-thalie-doc-2023.209.0.0.13asvn65249-55.1.noarch.rpm"
RPM_HASH = "960c126c844c7483d46c4be713470e73df66a74020c9e0899a3f98b6b5d18913a467eab82733a3bdc23058c4fb1bdb6abbb8d4b704b43a668d1c15c18fda7d86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thalie-doc"

RDEPENDS:${PN} += ""

inherit rpm
