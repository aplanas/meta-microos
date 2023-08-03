SUMMARY = "Documentation for texlive-bondgraph"
DESCRIPTION = "This package includes the documentation for texlive-bondgraph"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21670"

RPM_NAME = "texlive-bondgraph-doc-2023.209.1.0svn21670-53.1.noarch.rpm"
RPM_HASH = "2dbdbd65e2efb381e50c0158c4f1d3737a28b38823702dbc23363d98e552b42d5f2127fde04f99107b6e844fdd47486c23360bcc6374aae0498d88bcb4da7f5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bondgraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
