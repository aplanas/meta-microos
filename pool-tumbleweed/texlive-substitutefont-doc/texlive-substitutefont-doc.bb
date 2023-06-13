SUMMARY = "Documentation for texlive-substitutefont"
DESCRIPTION = "This package includes the documentation for texlive-substitutefont"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.4svn32066"

RPM_NAME = "texlive-substitutefont-doc-2023.201.0.0.1.4svn32066-57.1.noarch.rpm"
RPM_HASH = "69e352feb0cd3371d2692d122c0b5463018b1d673aea6ec9196e7c91d8bd14f9e5e1629d28f25c7dcf5721af941cae1b28fe393387d8b4811ae9c417c620a9da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-substitutefont-doc"

RDEPENDS:${PN} += ""

inherit rpm
