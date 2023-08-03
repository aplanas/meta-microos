SUMMARY = "Documentation for texlive-kvdefinekeys"
DESCRIPTION = "This package includes the documentation for texlive-kvdefinekeys"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn53193"

RPM_NAME = "texlive-kvdefinekeys-doc-2023.209.1.6svn53193-56.1.noarch.rpm"
RPM_HASH = "6418270cd3874c06050cd7c22d7cd78c3e2d9eb28075ed50cacc7d6a6cedbaafd4f08390e34aa8c2a33b8327e889a83510edc1f490a0a4dc731d92ea9e71f59f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kvdefinekeys-doc"

RDEPENDS:${PN} += ""

inherit rpm
