SUMMARY = "Documentation for texlive-autoarea"
DESCRIPTION = "This package includes the documentation for texlive-autoarea"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3asvn59552"

RPM_NAME = "texlive-autoarea-doc-2023.209.0.0.3asvn59552-54.1.noarch.rpm"
RPM_HASH = "62844a0aaf6eedf524603bdca051b23e22c494e9c18415b41e77b0db6bc7a8efc9a8419e8ef44c3763216b9e25602c49880fbd3f41e3bf1a315633d6131c0da0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-autoarea-doc"

RDEPENDS:${PN} += ""

inherit rpm
