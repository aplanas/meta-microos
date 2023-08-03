SUMMARY = "Documentation for texlive-brandeis-dissertation"
DESCRIPTION = "This package includes the documentation for texlive-brandeis-dissertation"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.13svn61215"

RPM_NAME = "texlive-brandeis-dissertation-doc-2023.209.3.13svn61215-53.1.noarch.rpm"
RPM_HASH = "e27299ca5663d2762dda13f58ff0027e9a9e9c9c79d73347e17f09096e203f2e248ba4d6ce9c7ca30f28f50fb81ace0ff746d20f2ed74f81f377a0e47e954185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-brandeis-dissertation-doc"

RDEPENDS:${PN} += ""

inherit rpm
