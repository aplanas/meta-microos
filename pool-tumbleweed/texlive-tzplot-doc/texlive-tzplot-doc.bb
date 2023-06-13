SUMMARY = "Documentation for texlive-tzplot"
DESCRIPTION = "This package includes the documentation for texlive-tzplot"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn64537"

RPM_NAME = "texlive-tzplot-doc-2023.201.2.1svn64537-52.1.noarch.rpm"
RPM_HASH = "c20d43c4f5c725c1d37017027f502ee1a7c23c79f11d58884574273fe0dd402ab1680cde052ac98ce23143cd121c7bbfc8f02148b2a7e52c441d8f2420e44b33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tzplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
