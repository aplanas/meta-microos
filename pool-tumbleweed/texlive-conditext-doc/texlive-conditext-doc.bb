SUMMARY = "Documentation for texlive-conditext"
DESCRIPTION = "This package includes the documentation for texlive-conditext"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn55387"

RPM_NAME = "texlive-conditext-doc-2023.209.1.5svn55387-54.1.noarch.rpm"
RPM_HASH = "bd0569fb3a7a76010b2c02f2edb31ba0cbd262cac2841478b759b3fe0c56414479d7d0c53dc068b0ce938204c65e96a66e598e2ce7226ef37f8b7bf0d3fc4765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-conditext-doc"

RDEPENDS:${PN} += ""

inherit rpm
