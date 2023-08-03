SUMMARY = "Documentation for texlive-sanitize-umlaut"
DESCRIPTION = "This package includes the documentation for texlive-sanitize-umlaut"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.1svn63770"

RPM_NAME = "texlive-sanitize-umlaut-doc-2023.209.1.2.1svn63770-54.1.noarch.rpm"
RPM_HASH = "8b739260556cc8066141b36e64225494d273ceff8b5a44884bd9e00890aa855ae30ac21d9946c600d208dc89145958c88d4287bcde49fcd5f3344ac65b9bc401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sanitize-umlaut-doc"

RDEPENDS:${PN} += ""

inherit rpm
