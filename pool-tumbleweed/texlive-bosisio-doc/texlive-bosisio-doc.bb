SUMMARY = "Documentation for texlive-bosisio"
DESCRIPTION = "This package includes the documentation for texlive-bosisio"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn16989"

RPM_NAME = "texlive-bosisio-doc-2023.209.svn16989-53.1.noarch.rpm"
RPM_HASH = "f7bf62c9a7fb211d4410c024bf8e8f96f41d3ce2365af9e3f30dc37458bc9e8242a92876775af93ebba99eb7dd77d44b9afdf78625b79fae661e09db2e808e47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bosisio-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
