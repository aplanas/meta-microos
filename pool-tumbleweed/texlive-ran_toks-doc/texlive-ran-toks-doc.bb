SUMMARY = "Documentation for texlive-ran_toks"
DESCRIPTION = "This package includes the documentation for texlive-ran_toks"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59515"

RPM_NAME = "texlive-ran_toks-doc-2023.201.svn59515-53.1.noarch.rpm"
RPM_HASH = "8629c38dcdb653c22b033b2ea7f8d022ec9742a68c755a3e9b7fc9a223b5be93b791ed0d2202f5b993a8d8a483fa1652f00747c1e577d154b3cc131ae6f267a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ran_toks-doc"

RDEPENDS:${PN} += ""

inherit rpm
