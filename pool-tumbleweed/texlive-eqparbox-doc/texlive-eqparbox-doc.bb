SUMMARY = "Documentation for texlive-eqparbox"
DESCRIPTION = "This package includes the documentation for texlive-eqparbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.1svn45215"

RPM_NAME = "texlive-eqparbox-doc-2023.209.4.1svn45215-54.1.noarch.rpm"
RPM_HASH = "6219969869615e23315a593cc36895c8979abc2c357b1f0627f7de609c3269fbe484ff2b0a2bcc15b158700a1005cf4ee79d52f67cef06b52066310d3518ba4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqparbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
