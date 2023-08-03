SUMMARY = "Documentation for texlive-datetime2-polish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-polish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn48456"

RPM_NAME = "texlive-datetime2-polish-doc-2023.209.1.1svn48456-53.1.noarch.rpm"
RPM_HASH = "d12cf9f8038ae554f78ae713a4a95471976dfc15c9496b8b1263d7051d13b59a3a05d1092408201f03869b278a3ea6d9a84318cf7d9c0af8fec551711af6f2e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-polish-doc"

RDEPENDS:${PN} += ""

inherit rpm
