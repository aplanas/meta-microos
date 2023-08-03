SUMMARY = "Documentation for texlive-diagbox"
DESCRIPTION = "This package includes the documentation for texlive-diagbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4svn54080"

RPM_NAME = "texlive-diagbox-doc-2023.209.2.4svn54080-53.1.noarch.rpm"
RPM_HASH = "2ea35bcbda313afbd5f8e70809369f80e485fdc9b7fa82faf173bd1b03f1e89db74392f223d6c9ba73da7d82bfb0aa3a6a86dde4b4e9eb6c65bd45b013dd3c16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diagbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
