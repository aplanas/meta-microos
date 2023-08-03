SUMMARY = "Documentation for texlive-pst-flags"
DESCRIPTION = "This package includes the documentation for texlive-pst-flags"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65501"

RPM_NAME = "texlive-pst-flags-doc-2023.209.svn65501-53.1.noarch.rpm"
RPM_HASH = "41ebf7897fb3bcd49fa11cb92de9b6a76283ca4a3a3e53ff8f741f981b8fb9eaad684633f5cdc83a5bb048aa68a677a32aacf2ea24d8c8391f1806ffd2745b0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-flags-doc"

RDEPENDS:${PN} += ""

inherit rpm
