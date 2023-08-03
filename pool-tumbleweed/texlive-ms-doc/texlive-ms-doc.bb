SUMMARY = "Documentation for texlive-ms"
DESCRIPTION = "This package includes the documentation for texlive-ms"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn57473"

RPM_NAME = "texlive-ms-doc-2023.209.svn57473-55.1.noarch.rpm"
RPM_HASH = "d1b40fa7faa302bfe165d7ed5754c82abb03fd4f4019eae50fa4d15f6d5c0884bb10978ac0f9a150e2357b065c5b300336af98294790c67ee58407da940cfa96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ms-doc"

RDEPENDS:${PN} += ""

inherit rpm
