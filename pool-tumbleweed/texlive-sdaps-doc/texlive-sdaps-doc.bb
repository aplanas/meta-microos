SUMMARY = "Documentation for texlive-sdaps"
DESCRIPTION = "This package includes the documentation for texlive-sdaps"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.10svn65345"

RPM_NAME = "texlive-sdaps-doc-2023.209.1.9.10svn65345-54.1.noarch.rpm"
RPM_HASH = "8e9ae6bd5f5952524b9121d38eef3cd3b67d21f8e7e24440d9cde412a58c1a4f8dff6e69437a0bc8b8617810c6f9b413c3260bc10924a8b656407bfa36e69127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sdaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
