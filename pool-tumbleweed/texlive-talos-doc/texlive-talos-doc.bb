SUMMARY = "Documentation for texlive-talos"
DESCRIPTION = "This package includes the documentation for texlive-talos"
LICENSE = "LPPL-1.3c"

PV = "2023.209.1.0svn61820"

RPM_NAME = "texlive-talos-doc-2023.209.1.0svn61820-55.1.noarch.rpm"
RPM_HASH = "78dcc68d9c94bc7bdbc77f6ed0a2ad032d8d36d279d487d63080fc6fc0994345ddd07197a18a5f871d0122b759bacd27f10e36690bebaf83aee90772add68174"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-talos-doc"

RDEPENDS:${PN} += ""

inherit rpm
