SUMMARY = "Documentation for texlive-luarandom"
DESCRIPTION = "This package includes the documentation for texlive-luarandom"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.01svn49419"

RPM_NAME = "texlive-luarandom-doc-2023.208.0.0.01svn49419-53.1.noarch.rpm"
RPM_HASH = "a9a060c11504d30e06291fd263d91f6d45c5ca4ad4c60eeb30bd69a67f5a9827cd9d4ff37194a975ce57393d9449600c9aeeae13c22eada2a81e066a5650975c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luarandom-doc"

RDEPENDS:${PN} += ""

inherit rpm
