SUMMARY = "Documentation for texlive-cyrillic"
DESCRIPTION = "This package includes the documentation for texlive-cyrillic"
LICENSE = "LPPL-1.0"

PV = "2023.204.20220601_pl1svn63613"

RPM_NAME = "texlive-cyrillic-doc-2023.204.20220601_pl1svn63613-54.1.noarch.rpm"
RPM_HASH = "0648e3df846ee1d0419cfcbbe919ab63066ef03b3746af0aaffaa6e6168919619d86cc61fb768174d33338731eed2a85d3cce5a41755ef031a4a20facf197301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cyrillic-doc"

RDEPENDS:${PN} += ""

inherit rpm
