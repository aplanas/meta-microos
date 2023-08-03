SUMMARY = "Documentation for texlive-borceux"
DESCRIPTION = "This package includes the documentation for texlive-borceux"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21047"

RPM_NAME = "texlive-borceux-doc-2023.209.svn21047-53.1.noarch.rpm"
RPM_HASH = "e5c6b317060232c86c5e45bad800791c2518e93e6687c16bf837a1b9ae8d4e493c74de6757cb8aa7f7eedb0e876cbc5ac35c0c3fc286ce1d8b0a5bfab3aa7a4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-borceux-doc"

RDEPENDS:${PN} += ""

inherit rpm
